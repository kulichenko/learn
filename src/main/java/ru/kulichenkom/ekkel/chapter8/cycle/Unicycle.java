//Сh8Ex1 Создайте класс cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//cycle, на примере вызова метода ride().
package ru.kulichenkom.ekkel.chapter8.cycle;

public class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int qtyWheels = 1;

    public void toRide() {
        wheels();
        System.out.println("This is cycle with name " + this.name + " and its riding now");
    }

    public int wheels() {
        System.out.println(this.name + " move on " + qtyWheels + " wheel");
        return qtyWheels;
    }
}
