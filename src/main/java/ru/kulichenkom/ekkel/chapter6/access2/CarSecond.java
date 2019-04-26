package ru.kulichenkom.ekkel.chapter6.access2;

import ru.kulichenkom.ekkel.chapter6.access.Cars;

public class CarSecond {
    public static void main(String[] args) {
        Cars car = new Cars()
                .withTypeOfCars("Легковой")
                .withPowerValue(105)
                .withNumOfCylinders(4)
                .withNumOfGears(5);
        //car.descriptionOfCar(); - доступа к методу нет
    }
}
