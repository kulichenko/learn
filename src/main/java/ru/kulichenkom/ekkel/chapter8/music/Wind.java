package ru.kulichenkom.ekkel.chapter8.music;

public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println("Adjusting Wind");
    }

    public void clearSpitValve() {
        System.out.println("Wind clearing spit valve");
    }
}
