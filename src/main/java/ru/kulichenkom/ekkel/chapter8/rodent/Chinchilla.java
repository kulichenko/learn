package ru.kulichenkom.ekkel.chapter8.rodent;

public class Chinchilla extends Rodent {
    public Chinchilla() {
        setName("Шиншилла");
    }

    public void sound() {
        System.out.println(getName() + " издает звук уть-уть");
    }
}
