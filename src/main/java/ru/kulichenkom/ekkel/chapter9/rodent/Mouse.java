package ru.kulichenkom.ekkel.chapter9.rodent;

public class Mouse extends Rodent {
    public Mouse() {
        setName("Мышь");
    }

    public void makeSound() {
        System.out.println(getName() + " издает звук пипипи");
    }

    @Override
    public void eat() {
        System.out.println("Все едят и мышь тоже...");
    }
}
