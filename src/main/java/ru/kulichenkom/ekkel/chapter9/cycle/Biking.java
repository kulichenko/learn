//Сh9Ex18 Создайте интерфейс Cycle с реализациями Unicycle,Bicycle,Tricycle.
//Создайте фабирку для каждой разновидности Cycle и код, использующий эти фабирики
package ru.kulichenkom.ekkel.chapter9.cycle;

public class Biking {

    public static void main(String[] args) {
        CycleFactory maker = new BicycleMaker();
        Cycle cycle = maker.createCycle();
        cycle.toRide();
    }
}