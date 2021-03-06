//Ch8Ex8 Измените программу Music3.java чтобы в ней случайным образом генерировались
//объекты Instrument, как в программе Shapes.java
//Ch8Ex7 Добавьте новый подтип Instrument в программу Music3.java.
//Убедитесь в том, что полиморфизм работает правильно и для этого
//нового типа (добавлен подтип Tambourine)
//Ch8Ex6 Измените программу Music3.java так, чтобы метод what() стал методом
//корневого класса Object toString(). Попробуйте вывести информацию об объектах
//Instrument вызовом System.out.println() (без использования преобразований)
//****************************************************************************
//Пакет .music - пример из книги, по нему будут несколько следующих заданий
package ru.kulichenkom.ekkel.chapter8.music;

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Tambourine extends Percussion {
    public void play(Note n) {
        System.out.println("Tambourine.play() " + n);
    }

    public String toString() {
        return "Tambourine";
    }

    public void adjust() {
        System.out.println("Adjusting Tambourine");
    }
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public void adjust() {
        System.out.println("Adjusting Brass");
    }

    public String toString() {
        return "Brass";
    }

    public void clearSpitValve() {
        System.out.println("Brass clearing spit valve");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }

    public void clearSpitValve() {
        System.out.println("Woodwind clearing spit valve");
    }
}

public class Music3 {
    private static RandInstrumentGenerator generator = new RandInstrumentGenerator();

    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
// ...
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
        }
    }
}
