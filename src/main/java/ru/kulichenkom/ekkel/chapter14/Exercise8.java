//Ch14Ex8 Напишите метод, который получает объект и рекурсивно выводит все классы в иерархии этого объекта.
package ru.kulichenkom.ekkel.chapter14;

class Animals {
}

class Land extends Animals {
}

class Pet extends Land {
}

public class Exercise8 {
    public static void getHierarchy(Class c) {

        while (true) {
            System.out.print(c.getCanonicalName());
            c = c.getSuperclass();
            if (c.getCanonicalName().equals("java.lang.Object")) {
                break;
            }
            System.out.print(" -> ");
        }
    }

    public static void main(String[] args) {
        getHierarchy(Pet.class);
    }
}