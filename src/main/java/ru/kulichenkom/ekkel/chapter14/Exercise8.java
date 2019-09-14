//Ch14Ex9 Измените пред упр так, чтобы в нем использовался метод Class.getDeclaredFields()
//для вывода информации о полях класса.
//Ch14Ex8 Напишите метод, который получает объект и рекурсивно выводит все классы в иерархии этого объекта.
package ru.kulichenkom.ekkel.chapter14;

class Animals {
    private boolean mammal;
}

class Land extends Animals {
    private int pawsQty;
}

class Pet extends Land {
    private String type;
    private String name;
    private String color;
}

public class Exercise8 {
    public static void getHierarchy(Class c) {
        while (true) {
            System.out.println(c.getSimpleName() + ": ");
            Object[] fields = c.getDeclaredFields();
            c = c.getSuperclass();
            for (Object object : fields) {
                System.out.println(object);
            }
            if (c.getCanonicalName().equals("java.lang.Object")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        getHierarchy(Pet.class);
    }
}