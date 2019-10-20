//Ch15Ex11 Протестируйте пример New.java. Созадйте собственные классы и убедитесь
// в том, что класс New с ними правильно работает.
package ru.kulichenkom.ekkel.chapter15;

import java.util.*;

public class TestNew {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Dog sharik = new Dog();
        Taksa bublik = new Taksa();
        List<Dog> dogList = New.list();
        dogList.add(bublik);
        dogList.add(sharik);
        Map<Integer, List<? extends Dog>> catMap = New.map();
        catMap.put(1, dogList);
        catMap.put(2, dogList);
        Set<Taksa> taksaSet = New.set();
        taksaSet.add(new Taksa());
        Queue<Cat> cats = New.queue();
        cats.add(murzik);
        System.out.println(catMap);
        System.out.println(dogList);
        System.out.println(taksaSet);
        System.out.println(cats);

    }
}

class Cat {
    @Override
    public String toString() {
        return "Cat";
    }
}

class Dog {
    @Override
    public String toString() {
        return "Dog";
    }
}

class Taksa extends Dog {
    @Override
    public String toString() {
        return "Taksa";
    }
}

//: net/mindview/util/New.java
// Utilities to simplify generic container creation
// by using type argument inference.
class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static <T> List<T> list() {
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<>();
    }

    public static <T> Set<T> set() {
        return new HashSet<>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }

    // Examples:
    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> qs = New.queue();
    }
}