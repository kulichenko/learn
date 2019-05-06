//Ch8Ex8 Измените программу Music3.java чтобы в ней случайным образом генерировались
//объекты Instrument, как в программе Shapes.java
package ru.kulichenkom.ekkel.chapter8.music;

import java.util.Random;

public class RandInstrumentGenerator {
    private Random rand = new Random();

    public Instrument next() {
        switch (rand.nextInt(6)) {
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Tambourine();
            case 3:
                return new Stringed();
            case 4:
                return new Brass();
            case 5:
                return new Woodwind();
            default:
                return null;
        }
    }
}
