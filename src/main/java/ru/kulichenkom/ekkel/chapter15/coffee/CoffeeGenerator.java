//Реализация интерфейса Generator. Параметрихзованный интерфейс Generator Гарантирует, что next()
//вернет параметр-тип. CoffeeGenerator также реализует интерфейс Iterable, что позволяет его использовать в
//конструкции foreach. Однако ему необходим сторож для обнаружения завершения перебора,
// который создается во втором конструкторе
package ru.kulichenkom.ekkel.chapter15.coffee;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private static Random rand = new Random(47);
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    // Для перебора:
    private int size = 0;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }

    public Coffee next() {
        try {
            return (Coffee)
                    types[rand.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }
}

class Americano extends Coffee {
}

class Latte extends Coffee {
}

class Mocha extends Coffee {
}

class Cappuccino extends Coffee {
}

class Breve extends Coffee {
}