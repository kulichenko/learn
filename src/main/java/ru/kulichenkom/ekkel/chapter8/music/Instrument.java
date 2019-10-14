package ru.kulichenkom.ekkel.chapter8.music;

public class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    public String toString() {
        return "Instrument";
    }

    public void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
