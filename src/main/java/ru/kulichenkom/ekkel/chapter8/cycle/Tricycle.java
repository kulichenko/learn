//Сh8Ex1 Создайте класс cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//cycle, на примере вызова метода ride().
package ru.kulichenkom.ekkel.chapter8.cycle;

public class Tricycle extends Cycle {
    private String name = "tricycle";
    private int qtyWheels = 3;

    public void toRide() {
        System.out.print("This is cycle with name " + this.name + " and its riding now ");
        wheels();
    }

    public void wheels() {
        System.out.println("on " + qtyWheels + " wheels");
    }
}