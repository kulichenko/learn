//Сh8Ex1 Создайте класс Cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//Cycle, на примере вызова метода ride().
package ru.kulichenkom.ekkel.chapter8;

public class Biking {

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        unicycle.toRide();
        bicycle.toRide();
        tricycle.toRide();
        cycle.toRide();
    }
}
