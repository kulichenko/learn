//Ch15Ex13 снизу под примером
package ru.kulichenkom.ekkel.chapter15;
//Для заполнения коллекций удобно использовать генератор, причем эту операцию логично обобщить.
//Обратите внимание на прозрачность применения обобщенного метода fill() к контейнерам и генераторам
//Coffee и Integer
//: generics/Generators.java
// A utility to use with Generators.

import ru.kulichenkom.ekkel.chapter15.coffee.Coffee;
import ru.kulichenkom.ekkel.chapter15.coffee.CoffeeGenerator;
import ru.kulichenkom.ekkel.chapter15.coffee.Generator;

import java.util.*;

public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i : fnumbers) {
            System.out.print(i + ", ");
        }
    }
}

//Ch15Ex13 Перегрузите метод fill() так, чтобы аргументы и возвращаемые типы были конкретными подтипами
//Collections: List, Queue и Set. При этом информация о типе контейнера не теряется. Сможет ли перегруженная версия
//отличить List и LinkedList?
class Generators13 {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> linkedList, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            linkedList.add(gen.next());
        }
        return linkedList;
    }

    public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            set.add(gen.next());
        }
        return set;
    }

    public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            queue.add(gen.next());
        }
        return queue;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i : fnumbers) {
            System.out.print(i + ", ");
        }
        System.out.println();
        List<Coffee> coffeeList = fill(new ArrayList<>(), new CoffeeGenerator(), 5);
        System.out.println("List type: " + coffeeList.getClass());
        System.out.println("coffeeList: " + coffeeList);
        List<Coffee> coffeeLinkedList = fill(new LinkedList<>(), new CoffeeGenerator(), 5);
        System.out.println("List type: " + coffeeLinkedList.getClass());
        System.out.println("coffeeLinkedList: " + coffeeLinkedList);
        Set<Coffee> coffeeSet = fill(new HashSet<>(), new CoffeeGenerator(), 5);
        System.out.println("Set type: " + coffeeSet.getClass());
        System.out.println("coffeeSet: " + coffeeSet);
        Queue<Coffee> coffeeQueue = fill(new ArrayDeque<>(), new CoffeeGenerator(), 5);
        System.out.println("Queue type: " + coffeeQueue.getClass());
        System.out.println("coffeeQueue: " + coffeeQueue);
    }
}