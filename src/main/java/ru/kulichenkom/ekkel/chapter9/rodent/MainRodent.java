//Ch9Ex1 Измените упражнение 9 тз предыдущей главы так, чтобы класс
// Rodent стал абстрактным классом. Сделайте некоторые методы
// класса Rodent абстрактными (там где это оправданно).

package ru.kulichenkom.ekkel.chapter9.rodent;

import java.util.Random;

public class MainRodent {
    private static RandomGenerator generator = new RandomGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = generator.next();
        }

        for (Rodent rod : rodents) {
            rod.makeSound();
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
