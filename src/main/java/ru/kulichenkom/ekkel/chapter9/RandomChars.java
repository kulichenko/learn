//Ch9Ex16 Создайте класс, который генерирует серию char. Адаптируйте его так,
//чтобы он мог использоваться для передачи данных Scanner.
package ru.kulichenkom.ekkel.chapter9;

import java.util.Random;

public class RandomChars {
    private static Random random = new Random();

    public static void main(String[] args) {
        RandomChars randomChars = new RandomChars();
        for (int i = 0; i < 10; i++)
            System.out.print(randomChars.next() + " ");
    }

    public char next() {
        return (char) random.nextInt(65);
    }
}
