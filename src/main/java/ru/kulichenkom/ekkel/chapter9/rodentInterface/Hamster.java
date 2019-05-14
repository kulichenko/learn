package ru.kulichenkom.ekkel.chapter9.rodentInterface;

public class Hamster implements Rodent {
    private String name = "Хомяк";

    @Override
    public void makeSound() {
        System.out.println(name + " издает звук фуфуфуф");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест траву");
    }

    @Override
    public void gnaw() {
        System.out.println(name + " грызет стружку");
    }
}
