//Ch7Ex7 Измените упражнение 5 так, чтобы классы А и В имели кунструкторы с аргументами
//вместо конструкторов по умолчанию. Напишите конструктор для класса С и проведите всю необходимую
//инициализацию для него.
// Ch7Ex5 Создайте два класса А и В, имеющие конструкторы по умолчанию, которые выводят сообщения
//о вызове. Создайте новый класс С, производный от А. Создайте в С поле типа В.
// Не создавайте конструктор С. Создайте объект класса С и проследите за происходящим.

package ru.kulichenkom.ekkel.chapter7;

class Bikes {
    public Bikes(String type) {
        System.out.println("class Bikes " + type);
    }
}

class Scooters {

    public Scooters(String type) {
        System.out.println("class Scooters" + type);
    }
}

public class MountainBike extends Bikes {
    private Scooters power;

    public MountainBike(String type, String power) {
        super(type);
        this.power = new Scooters(power);
    }

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike("Mountain bike", " 250 watt");
    }
}
