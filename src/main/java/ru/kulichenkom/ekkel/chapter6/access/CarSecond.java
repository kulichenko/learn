package ru.kulichenkom.ekkel.chapter6.access;

public class CarSecond {
    public static void main(String[] args) {
        Cars car = new Cars()
                .withTypeOfCars("Легковой")
                .withPowerValue(105)
                .withNumOfCylinders(4)
                .withNumOfGears(5);
        car.descriptionOfCar();
    }
}
