//Ch14Ex26 Реализуйте clearSpitValve() как описано в резюме к главе.

package ru.kulichenkom.ekkel.chapter14;

import ru.kulichenkom.ekkel.chapter8.music.Instrument;
import ru.kulichenkom.ekkel.chapter8.music.Note;
import ru.kulichenkom.ekkel.chapter8.music.RandInstrumentGenerator;
import ru.kulichenkom.ekkel.chapter8.music.Wind;

public class Exercise26 {

    private static RandInstrumentGenerator generator = new RandInstrumentGenerator();

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument... e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[5];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = generator.next();
        }
        tuneAll(orchestra);
        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
            if (instrument instanceof Wind) {
                ((Wind) instrument).clearSpitValve();
            }
            instrument.adjust();
        }
    }
}