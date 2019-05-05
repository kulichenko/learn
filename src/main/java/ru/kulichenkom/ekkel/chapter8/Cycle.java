//Сh8Ex1 Создайте класс Cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//Cycle, на примере вызова метода ride().
package ru.kulichenkom.ekkel.chapter8;

public class Cycle {
    Cycle() {
        System.out.println("Constructor Cycle");
    }

    public static void toRide(Cycle cycle) {
        System.out.println("Cycle.toRide()");
    }
}
