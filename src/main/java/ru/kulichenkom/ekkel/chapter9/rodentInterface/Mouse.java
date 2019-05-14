package ru.kulichenkom.ekkel.chapter9.rodentInterface;

public class Mouse implements Rodent {

    private String name = "Мышь";

    @Override
    public void makeSound() {
        System.out.println(name + " издает звук пипипи");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест сыр");
    }

    @Override
    public void gnaw() {
        System.out.println(name + " грызет орех");
    }
}
