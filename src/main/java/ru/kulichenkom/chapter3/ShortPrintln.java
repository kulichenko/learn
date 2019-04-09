package ru.kulichenkom.chapter3;//Глава 3. Упр 1. Напишите програаму, в которой используются как короткие, так и длинные команды печати.
//static означает, что метод связан с классом, а не с конкретным экземпляром (объектом) этого класса.
// Это означает, что вы можете вызвать статический метод, не создавая объект класса.

import static ru.kulichenkom.utils.Print.print;

public class ShortPrintln {
    public static void main(String[] args) {
        System.out.println("Standard println");
        print("Short method of print");
    }
}
