//Ch15Ex8 По образцу Coffee создайте иерархию персонажей StoryCharacters, разделив их на полож
//и отрицательные. Создайте генератор для StoryCharacters по образцу CoffeeGenerator.
package ru.kulichenkom.ekkel.chapter15;

import ru.kulichenkom.ekkel.chapter15.coffee.Generator;

import java.util.Iterator;
import java.util.Random;

public class StoryCharacters implements Generator<Characters>, Iterable<Characters> {

    private static Random rand = new Random(47);
    private Class[] heroes = {Krosh.class, Losyash.class, Sova.class, Pin.class, Kopatych.class};
    // Для перебора:
    private int size = 0;

    public StoryCharacters() {
    }

    public StoryCharacters(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        StoryCharacters gen = new StoryCharacters();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Characters c : new StoryCharacters(5)) {
            System.out.println(c);
        }
    }

    @Override
    public Characters next() {
        try {
            return (Characters) heroes[rand.nextInt(heroes.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Characters> iterator() {
        return new CharacterIterator();
    }

    class CharacterIterator implements Iterator<Characters> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Characters next() {
            count--;
            return StoryCharacters.this.next();
        }

        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }
}

class Characters {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuy extends Characters {
}

class BadGuy extends Characters {
}

class Krosh extends BadGuy {
}

class Losyash extends GoodGuy {
}

class Sova extends GoodGuy {
}

class Pin extends BadGuy {
}

class Kopatych extends GoodGuy {
}