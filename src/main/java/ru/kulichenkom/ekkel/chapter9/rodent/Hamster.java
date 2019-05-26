package ru.kulichenkom.ekkel.chapter9.rodent;

public class Hamster extends Rodent {
    public Hamster() {
        setName("Хомяк");
    }

    public void makeSound() {
        System.out.println(getName() + " издает звук фуфуфуф");
    }

    @Override
    public void eat() {
        System.out.println("Хомяк ест...");
    }
}
