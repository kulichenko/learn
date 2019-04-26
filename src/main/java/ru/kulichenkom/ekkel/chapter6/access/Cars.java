//Ch6Ex4 Покажите, что методы со спецификатором protected обладают доступом в пределах пакета,
//но не являются открытыми. Класс внутри пакета - CarSecond, в соседнем пакете access2 - CarSecond
package ru.kulichenkom.ekkel.chapter6.access;

public class Cars {
    String typeOfCars;
    int powerValue, numOfCylinders, numOfGears;

    public Cars withTypeOfCars(String typeOfCars) {
        this.typeOfCars = typeOfCars;
        return this;
    }

    public Cars withPowerValue(int powerValue) {
        this.powerValue = powerValue;
        return this;
    }

    public Cars withNumOfCylinders(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
        return this;
    }

    public Cars withNumOfGears(int numOfGears) {
        this.numOfGears = numOfGears;
        return this;
    }

    protected void descriptionOfCar() {
        System.out.println("Тип авто: " + typeOfCars);
        System.out.println("Мощность " + powerValue);
        System.out.println("Количество цилиндров " + numOfCylinders);
        System.out.println("Количество передач " + numOfGears);
    }
}
