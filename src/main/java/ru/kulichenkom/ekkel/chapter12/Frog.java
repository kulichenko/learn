//Ch12Ex17 Измените пример polymorphism/Frog.java, чтобы он использовал try-finally для
//обеспечения необходимых завершающих действий. Покажите, что программа работает даже
//при возврате из середины блока try-finally
package ru.kulichenkom.ekkel.chapter12;

class Characteristic {
    private String characteristic;

    Characteristic(String characteristic) {
        this.characteristic = characteristic;
        System.out.println("Создание характеристики " + characteristic);
    }

    protected void dispose() {
        System.out.println("Удаление характеристики " + characteristic);
    }
}

class Description {
    private String description;

    Description(String description) {
        this.description = description;
        System.out.println("Создание описания " + description);
    }

    protected void dispose() {
        System.out.println("удаление описания " + description);
    }
}

class LivingCreature {
    private Characteristic properties = new Characteristic("живой");
    private Description descr = new Description("Базовое живое существо");

    LivingCreature() {
        System.out.println("Конструктор LivingCreature()");
    }

    protected void dispose() {
        System.out.println("Удалить живое существо");
        descr.dispose();
        properties.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic properties = new Characteristic("имеет сердце");
    private Description descr = new Description("Животное это не овощь");

    Animal() {
        System.out.println("Конструктор Animal()");
    }

    protected void dispose() {
        System.out.println("Удаление животного");
        descr.dispose();
        properties.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic properties = new Characteristic("может жить в воде");
    private Description descr = new Description("На земле и в воде");

    Amphibian() {
        System.out.println("Конструктор Amphibian()");
    }

    protected void dispose() {
        System.out.println("Удаление земноводного");
        descr.dispose();
        properties.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian {
    private Characteristic properties = new Characteristic("квакает");
    private Description descr = new Description("Ест жуков");

    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("Удаление лягушки");
        descr.dispose();
        properties.dispose();
        super.dispose();
    }

    public void jump() {
        System.out.println("Лягушка прыгает");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            frog.jump();
            System.out.println("Возврат из блока try-finally");
            return;
        } finally {
            System.out.println("Пока");
            frog.dispose();
        }

    }
}