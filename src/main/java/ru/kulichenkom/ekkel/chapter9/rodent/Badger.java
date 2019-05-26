package ru.kulichenkom.ekkel.chapter9.rodent;

public class Badger extends Rodent {
    public Badger() {
        setName("Барсук");
    }

    public void makeSound() {
        System.out.println(getName() + " издает звук аа-ааа-аа");
    }

    @Override
    public void eat() {
        System.out.println("Барсук ест...");
    }
}
