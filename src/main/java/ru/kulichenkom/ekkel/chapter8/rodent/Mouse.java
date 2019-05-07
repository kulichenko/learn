package ru.kulichenkom.ekkel.chapter8.rodent;

public class Mouse extends Rodent {
    public Mouse() {
        setName("Мышь");
    }

    public void sound() {
        System.out.println(getName() + " издает звук пипипи");
    }
}
