//Сh8Ex1 Создайте класс cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//cycle, на примере вызова метода ride().
//Ch8Ex5 В упражнении 1 добавьте к классу cycle метод wheels(), возвращающий количество колес
//каждого транспортного средства. Измените метод ride() так, чтобы вызывал wheels(), и убедитесь в том, что
//полиморфизм успешно работает.
package ru.kulichenkom.ekkel.chapter8.cycle;

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