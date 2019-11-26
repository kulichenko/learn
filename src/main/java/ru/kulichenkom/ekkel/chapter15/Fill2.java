package ru.kulichenkom.ekkel.chapter15;

//: generics/Fill2.java
// Using adapters to simulate latent typing.
// {main: Fill2Test}

import ru.kulichenkom.ekkel.chapter14.pets.Cat;
import ru.kulichenkom.ekkel.chapter14.pets.Dog;
import ru.kulichenkom.ekkel.chapter14.pets.Hamster;
import ru.kulichenkom.ekkel.chapter14.pets.Pet;
import ru.kulichenkom.ekkel.chapter15.coffee.Coffee;
import ru.kulichenkom.ekkel.chapter15.coffee.Latte;
import ru.kulichenkom.ekkel.chapter15.coffee.Mocha;
import ru.kulichenkom.utils.Generator;

import java.util.*;

interface Addable<T> {
    void add(T t);
}

public class Fill2 {
    // Classtoken version:
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++) {
            try {
                addable.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Generator version:
    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
        for (int i = 0; i < size; i++) {
            addable.add(generator.next());
        }
    }
}

// To adapt a base type, you must use composition.
// Make any Collection Addable using composition:
class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }

    public void add(T item) {
        c.add(item);
    }
}

// A Helper to capture the type automatically:
class Adapter {
    public static <T>
    Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<T>(c);
    }
}

// To adapt a specific type, you can use inheritance.
// Make a SimpleQueue Addable using inheritance:
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
    public void add(T item) {
        super.add(item);
    }
}

class Fill2Test {
    public static void main(String[] args) {
        // Adapt a Collection:
        List<Coffee> carrier = new ArrayList<Coffee>();
        Fill2.fill(
                new AddableCollectionAdapter<Coffee>(carrier),
                Coffee.class, 3);
        // Helper method captures the type:
        Fill2.fill(Adapter.collectionAdapter(carrier),
                Latte.class, 2);
        for (Coffee c : carrier)
            System.out.println(c);
        System.out.println("----------------------");
        // Use an adapted class:
        AddableSimpleQueue<Coffee> coffeeQueue =
                new AddableSimpleQueue<Coffee>();
        Fill2.fill(coffeeQueue, Mocha.class, 4);
        Fill2.fill(coffeeQueue, Latte.class, 1);
        for (Coffee c : coffeeQueue)
            System.out.println(c);
    }
}

//Ch15Ex40 Измените пример Fill2.java, чтобы вместо классов Coffee
//в нем использовались классы из typeinfo.pets.

class Fill40Test {
    public static void main(String[] args) {
        // Adapt a Collection:
        List<Pet> carrier = new ArrayList<>();
        Fill2.fill(new AddableCollectionAdapter<Pet>(carrier), Pet.class, 3);
        // Helper method captures the type:
        Fill2.fill(Adapter.collectionAdapter(carrier), Dog.class, 2);
        for (Pet pet : carrier) {
            System.out.println(pet);
        }
        System.out.println("----------------------");
        // Use an adapted class:
        AddableSimpleQueue<Pet> petsQueue = new AddableSimpleQueue<>();
        Fill2.fill(petsQueue, Cat.class, 4);
        Fill2.fill(petsQueue, Hamster.class, 1);
        for (Pet pet : petsQueue)
            System.out.println(pet);
    }
}

//: generics/SimpleQueue.java
// A different kind of container that is Iterable

class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    public Iterator<T> iterator() {
        return storage.iterator();
    }
}