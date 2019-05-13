//Ch8Ex9 Создайте иерархию наследования, используя в качестве основы различные типы грызунов (Rodent).
//В базовом классе определите несколько общих методов, которые затем переопределите
//в производных классах, для того, чтобы они производили действие, свойственное конкретному
//типу объекта. Создайте массив из объектов Rodent, заполните его различными производными типами
//и вызовите методы базового класса, чтобы увидеть результат работы программы.

package ru.kulichenkom.ekkel.chapter8.rodent;

import java.util.Random;

public class MainRodent {
    private static RandomGenerator generator = new RandomGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = generator.next();
        }

        for (Rodent rod : rodents) {
            rod.sound();
            rod.eat();
            rod.gnow();
        }
    }
}

class RandomGenerator {
    private Random random = new Random();

    public Rodent next() {
        switch (random.nextInt(4)) {
            case 0:
                return new Mouse();
            case 1:
                return new Hamster();
            case 2:
                return new Chinchilla();
            case 3:
                return new Badger();
            default:
                return null;
        }
    }
}
