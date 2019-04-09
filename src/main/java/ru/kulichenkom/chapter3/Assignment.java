//Создайте класс с полем float. Используйте его для демонстрации совмещения имен.
package ru.kulichenkom.chapter3;

import static ru.kulichenkom.utils.Print.print;

public class Assignment {
    float value;

    public static void main(String[] args) {
        Assignment length1 = new Assignment();
        Assignment length2 = new Assignment();
        length1.value = 1.325f;
        length2.value = 5.987f;
        print("length1 = " + length1.value);
        print("lenght2 = " + length2.value + "\n");
        length1 = length2;
        print("length1 = " + length1.value);
        print("lenght2 = " + length2.value + "\n");
        length2.value = 270.254f;
        print("length1 = " + length1.value);
        print("lenght2 = " + length2.value);
    }
}
