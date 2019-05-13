package ru.kulichenkom.ekkel.chapter8.rodent;

public class Hamster extends Rodent {
    public Hamster() {
        setName("Хомяк");
    }

    public void sound() {
        System.out.println(getName() + " издает звук фуфуфуф");
    }
}
