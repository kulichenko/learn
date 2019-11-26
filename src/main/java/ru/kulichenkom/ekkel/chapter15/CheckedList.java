//Ch15Ex35 Измените пример CheckedList.java так, чтобы в нем использовались
//классы Coffee, определенные в этой главе.
package ru.kulichenkom.ekkel.chapter15;

import ru.kulichenkom.ekkel.chapter15.coffee.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    static void oldStyleMethod(List probablyCoffee) {
        probablyCoffee.add(new Latte());
    }

    public static void main(String[] args) {
        List<Americano> americanos = new ArrayList<>();
        oldStyleMethod(americanos); //принимает без возражений
        //возбуждает исключение
        List<Americano> americanoList = Collections.checkedList(new ArrayList<>(), Americano.class);
        try {
            oldStyleMethod(americanoList);
        } catch (Exception e) {
            System.out.println(e);
        }
        //производные типы работают нормально
        List<Coffee> coffeeList = Collections.checkedList(new ArrayList<>(), Coffee.class);
        coffeeList.add(new Cappuccino());
        coffeeList.add(new Mocha());
    }
}