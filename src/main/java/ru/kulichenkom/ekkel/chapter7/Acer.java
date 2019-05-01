//Докажите, что конструкторы базового класса: (а) всегда вызываются и (б)
//всегда вызываются перед исполнением конструкторов производного класса
package ru.kulichenkom.ekkel.chapter7;

class Computer {
    Computer() {
        System.out.println("Базовый класс Computer");
    }
}

class PersonalComputer extends Computer {
    PersonalComputer() {
        System.out.println("Производный от Computer класс PersonalComputer");
    }
}

class Laptop extends PersonalComputer {
    Laptop() {
        System.out.println("Производный от PersonalComputer класс Laptop");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
    }
}

public class Acer extends Laptop {
    Acer() {
        System.out.println("Производный от Laptop класс Acer");
    }

    public static void main(String[] args) {
        Acer acer = new Acer();
        Laptop.main(args);
    }
}