//Сh9Ex18 Создайте интерфейс Cycle с реализациями Unicycle,Bicycle,Tricycle.
//Создайте фабирку для каждой разновидности Cycle и код, использующий эти фабирики
package ru.kulichenkom.ekkel.chapter9.cycle;

interface CycleFactory {
    Cycle createCycle();
}

class UnicycleMaker implements CycleFactory {

    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}

class BicycleMaker implements CycleFactory {

    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}

class TricycleMaker implements CycleFactory {

    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}