//Ch7Ex19 Создайте класс с пустой final ссылкой на объект.
//Проведите инициализацию пустой константы во всех конструкторах.
//Продемонстрируйте гарантированную инициализацию перед использованием
//и невозможность ее изменения после инициализации.
package ru.kulichenkom.ekkel.chapter7;

class Animal {
    private int age;

    Animal(int year) {
        age = year;
    }

    public String toString() {
        return ("Animal's age " + age);
    }
}

public class Cat {
    private final Animal cat;

    public Cat() {
        cat = new Animal(10);
    }

    public Cat(int x) {
        cat = new Animal(x); // Initialize blank final reference
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(12);
        // cat1.cat = new Animal(2); // Errors: cannot assign values
        // cat2.cat = new Animal(3); // to final variables cat
        System.out.println("cat1.cat: " + cat1.cat);
        System.out.println("cat2.cat: " + cat2.cat);
    }
}