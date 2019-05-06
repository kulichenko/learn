//Ch8Ex7 Добавьте новый подтип Instrument в программу Music3.java.
//Убедитесь в том, что полиморфизм работает правильно и для этого
//нового типа (добавлен подтип Tambourine)
//Ch8Ex6 Измените программу Music3.java так, чтобы метод what() стал методом
//корневого класса Object toString(). Попробуйте вывести информацию об объектах
//Instrument вызовом System.out.println() (без использования преобразований)
//****************************************************************************
//Пакет .music - пример из книги, по нему будут несколько следующих заданий
package ru.kulichenkom.ekkel.chapter8.music;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Tambourine extends Percussion {
    void play(Note n) {
        System.out.println("Tambourine.play() " + n);
    }

    public String toString() {
        return "Tambourine";
    }

    void adjust() {
        System.out.println("Adjusting Tambourine");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}

public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
        i.play(Note.B_FLAT);
    }

    public static void tuneAll(Instrument[] e) {

        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Tambourine(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
        }
    }
}
