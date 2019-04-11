//Ch4Ex7 Измените упр 1 так, чтобы выход из программы осуществлялся ключевым словом
//breack при значении 99. Попробуйте использовать ключевое слово return.
package ru.kulichenkom.ekkel.chapter4;

public class Counter1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i > 99)
                break;
                //return;
            else
                System.out.println(i);
        }
    }
}
