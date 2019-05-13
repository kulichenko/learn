//Ch9Ex1 Измените упражнение 9 тз предыдущей главы так, чтобы класс
// Rodent стал абстрактным классом. Сделайте некоторые методы
// класса Rodent абстрактными (там где это оправданно).

package ru.kulichenkom.ekkel.chapter9.rodent;

public abstract class Rodent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " фшух");
    }

    public abstract void eat();

    public void gnow() {
        System.out.println(name + " грызет...");
    }
}
