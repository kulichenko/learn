package ru.kulichenkom.ekkel.chapter9.rodent;

public class Chinchilla extends Rodent {
    public Chinchilla() {
        setName("Шиншилла");
    }

    public void makeSound() {
        System.out.println(getName() + " издает звук уть-уть");
    }

    @Override
    public void eat() {
        System.out.println("Шиншилла тоже ест...");
    }
}
