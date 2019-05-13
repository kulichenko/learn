package ru.kulichenkom.ekkel.chapter8.rodent;

public class Badger extends Rodent {
    public Badger() {
        setName("Барсук");
    }

    public void sound() {
        System.out.println(getName() + " издает звук аа-ааа-аа");
    }
}
