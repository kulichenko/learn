//Ch9Ex10 Измените программу Music5.java, добавив в нее интерфейс Playable. Переместите
// объявление play() из класса Instrument в интерфейс Playable. Добавьте Playable к
// производным классам, включив его в список implements. Измените метод tune так,
// чтобы в аргументе ему передавался интерфейс Playable, а не класс Instrument.
package ru.kulichenkom.ekkel.chapter9.music5;

import ru.kulichenkom.ekkel.chapter8.music.Note;

interface Playable {
    void play(Note n); // Automatically public
}

interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final

    // Cannot have method definitions:
    void adjust();
}

class Wind implements Instrument, Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument, Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument, Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Playable playable) {
        // ...
        playable.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}