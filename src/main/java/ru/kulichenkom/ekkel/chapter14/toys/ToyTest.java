//: typeinfo/toys/ToyTest.java
// Testing class Class.
//Пример из книги стр 456, на базе которого необходимо выполнять упражнения.
//-----------------------------------------------------------------------------------
//Ch14Ex2 - Встройте новый интерфейс в ToyTest.java. Убедитесь, что он обнаруживается,
//А информация о нем выводится программой.
package ru.kulichenkom.ekkel.chapter14.toys;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface Plush {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, Plush {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ru.kulichenkom.ekkel.chapter14.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
} /* Output:
Class name: ru.kulichenkom.ekkel.chapter14.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : ru.kulichenkom.ekkel.chapter14.toys.FancyToy
Class name: ru.kulichenkom.ekkel.chapter14.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : ru.kulichenkom.ekkel.chapter14.toys.HasBatteries
Class name: ru.kulichenkom.ekkel.chapter14.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : ru.kulichenkom.ekkel.chapter14.toys.Waterproof
Class name: ru.kulichenkom.ekkel.chapter14.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : ru.kulichenkom.ekkel.chapter14.toys.Shoots
Class name: ru.kulichenkom.ekkel.chapter14.toys.Plush is interface? [true]
Simple name: Plush
Canonical name : ru.kulichenkom.ekkel.chapter14.toys.Plush
Class name: ru.kulichenkom.ekkel.chapter14.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : ru.kulichenkom.ekkel.chapter14.toys.Toy

Process finished with exit code 0
*///:~
