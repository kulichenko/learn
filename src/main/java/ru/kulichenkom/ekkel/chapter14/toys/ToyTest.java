//Ch14Ex19 В программе ToyTest.java используйте отражение
//для создания объекта Toy конструктором с аргументами.
//: typeinfo/toys/ToyTest.java
// Testing class Class.
//Пример из книги стр 456, на базе которого необходимо выполнять упражнения.
//-----------------------------------------------------------------------------------
//Ch14Ex2 - Встройте новый интерфейс в ToyTest.java. Убедитесь, что он обнаруживается,
//А информация о нем выводится программой.
package ru.kulichenkom.ekkel.chapter14.toys;

import java.lang.reflect.InvocationTargetException;

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
        System.out.println("Creating Toy() object");
    }

    Toy(int i) {
        System.out.println("Creating Toy(" + i + ") object");
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
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}