package ru.kulichenkom.ekkel.chapter15;
//: net/mindview/util/BasicGenerator.java
// Automatically create a Generator, given a class
// with a default (no-arg) constructor.

import ru.kulichenkom.ekkel.chapter15.coffee.Generator;

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    // Produce a Default generator given a type token:
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }

    public T next() {
        try {
            // Assumes type is a public class:
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
//: generics/BasicGeneratorDemo.java

class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}

//: generics/CountedObject.java
class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject " + id;
    }
}

//Ch15Ex14 Измените пример BasicGeneratorDemo.java, чтобы в нем использовалась явная форма создания
//Generator (то есть используйте явный вызов конструктора вместо обобщенного вызова метода create())
class BasicGeneratorDemo14 {
    public static void main(String[] args) {
        Generator<CountedObject> gen = new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}