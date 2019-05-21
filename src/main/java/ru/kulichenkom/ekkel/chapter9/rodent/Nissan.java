//Ch9Ex14 Создайте три интерфейса, каждый из которых содержит по 2 метода.
//Объявите новый интерфейс, производный от первых трех, включите в него
//новый метод. Создайте класс, который реализует новый интерфейс, а также
//является производным от конкретного класса.
//Напищите 4 метода, каждый из которых получает один из четырех интерфейсов
//в аргументе. Создайте в main() объект этого класса и передайте его каждому
//из методов.

package ru.kulichenkom.ekkel.chapter9.rodent;

interface Engine {
    void startEngine();

    void stopEngine();
}

interface Gearbox {
    void gearUp();

    void gearDown();
}

interface Throttle {
    void openThrottle();

    void closeThrottle();
}

interface Car extends Engine, Gearbox, Throttle {
    void movingCar();
}

class Vehicle {
    public void openDoors() {
        System.out.println("Двери открыты");
    }

    public void closeDoors() {
        System.out.println("Двери закрыты");
    }
}

class PassengerVehicle extends Vehicle implements Car {

    @Override
    public void startEngine() {
        System.out.println("Включить двигатель");
    }

    @Override
    public void stopEngine() {
        System.out.println("Выключить двигатель");
    }

    @Override
    public void gearUp() {
        System.out.println("Повысить передачу");
    }

    @Override
    public void gearDown() {
        System.out.println("Понизить передачу");
    }

    @Override
    public void openThrottle() {
        System.out.println("Открыть дроссельную заслонку");
    }

    @Override
    public void closeThrottle() {
        System.out.println("Закрыть дроссельную заслонку");
    }

    @Override
    public void movingCar() {
        System.out.println("Движение автомобиля");
    }
}

public class Nissan {
    public static void engineSwitches(Engine engine) {
        engine.startEngine();
        engine.stopEngine();
    }

    public static void gearboxSwitches(Gearbox gearbox) {
        gearbox.gearUp();
        gearbox.gearDown();
    }

    public static void throttleShifting(Throttle throttle) {
        throttle.openThrottle();
        throttle.closeThrottle();
    }

    public static void carMotion(Car car) {
        car.movingCar();
    }

    public static void main(String[] args) {
        Car xtrail = new PassengerVehicle();
        engineSwitches(xtrail);
        gearboxSwitches(xtrail);
        throttleShifting(xtrail);
        carMotion(xtrail);
        Vehicle teana = new PassengerVehicle();
        teana.openDoors();
        teana.closeDoors();
    }
}