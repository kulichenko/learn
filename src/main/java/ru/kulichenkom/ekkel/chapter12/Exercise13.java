//Измените упр 9, добавив туда блок finally. Проверьте, что блок выполняется, даже в случае возбуждения
//NullPointerException
//
//Ch12Ex9 Создайте 3 новых типа исключений. Напишите класс с методом
// возбуждающим каждое из них. В методе main() вызовите этот метод,
// используя одно предложение catch, способное перехватить все три исключения.
package ru.kulichenkom.ekkel.chapter12;

import java.util.Random;

public class Exercise13 {
    private static Integer[] index = new Integer[1];

    private static void exceptionCaller(int i) throws Exception {
        if (i > 0) {
            throw new MyFirstException("MyFirstException thrown because i > 0");
        }
        if (i < 0) {
            throw new MyThirdException("MyThirdException thrown because i < 0");
        }
        if (i == 0) {
            throw new MySecondException("MySecondException thrown because i = 0");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
        try {
            exceptionCaller(index[0]);
//            exceptionCaller(i);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Блок finally срабатывает");
        }
    }
}