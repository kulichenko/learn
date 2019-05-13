//Сh8Ex1 Создайте класс cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//cycle, на примере вызова метода ride().
package ru.kulichenkom.ekkel.chapter8.cycle;

public class Unicycle extends Cycle {
    private String name = "unicycle";
    private int qtyWheels = 1;

    public void balance() {
        System.out.println("Unicycle is balanced...");
    }

    public void toRide() {
        System.out.print("This is cycle with name " + this.name + " and its riding now ");
        wheels();
    }

    public void wheels() {
        System.out.println("on " + qtyWheels + " wheel");
    }
}
