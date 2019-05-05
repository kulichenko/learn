//Сh8Ex1 Создайте класс Cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//Cycle, на примере вызова метода ride().
package ru.kulichenkom.ekkel.chapter8;

public class Bicycle extends Cycle {
    private String name = "Bicycle";

    public void toRide() {
        System.out.println("This is cycle with name " + this.name + " and its riding now");
    }
}
