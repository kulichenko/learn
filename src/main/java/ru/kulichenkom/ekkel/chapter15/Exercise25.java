//Ch15Ex25 Создайте 2 интерфейса и класс реализующий оба интерфейса.
//Создайте 2 обобщенных метода; у одного параметр-тип ограничивается первым интерфейсом
//а у другого - вторым интерфейсом. СОздайте экземпляр класса, который реализует оба интерфейса и покажите,
//что он может использоваться с обоими обобщенными методами.
package ru.kulichenkom.ekkel.chapter15;

interface Transport {
}

interface Bus {
}

class Paz implements Transport, Bus {

}

public class Exercise25 {
    public static void main(String[] args) {
        Exercise25 exercise25 = new Exercise25();
        Paz paz = new Paz();
        exercise25.transportTo(paz);
        exercise25.openDoor(paz);
    }

    public <T extends Transport> void transportTo(T t) {
        System.out.println("transportTo()");
    }

    public <T extends Bus> void openDoor(T t) {
        System.out.println("openDoor()");
    }
}
