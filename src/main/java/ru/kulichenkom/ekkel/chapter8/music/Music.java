//Пакет .music - пример из книги, по нему будут несколько следующих заданий
package ru.kulichenkom.ekkel.chapter8.music;

public class Music {
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}