//Ch9Ex7 Измените упражнение 9 главы 8 так, чтобы тип Rodent бы оформлен как интерфейс.

package ru.kulichenkom.ekkel.chapter9.rodentInterface;

import java.util.Random;

public class MainRodent {
    private static RandomGenerator generator = new RandomGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = generator.next();
        }

        for (Rodent rod : rodents) {
            rod.makeSound();
            rod.eat();
            rod.gnaw();
        }
    }
}

class RandomGenerator {
    private Random random = new Random();

    public Rodent next() {
        switch (random.nextInt(2)) {
            case 0:
                return new Mouse();
            case 1:
                return new Hamster();
            default:
                return null;
        }
    }
}
