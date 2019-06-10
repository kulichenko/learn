//Ch10Ex8 Проверьте, доступны ли для внешнего класса закрытые элементы внутреннего класса.
package ru.kulichenkom.ekkel.chapter10;

public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = animal.new Cat();
        cat.name = "Marusya";
        cat.voice();
    }

    class Cat {
        private String name;

        private void voice() {
            System.out.println("Cat " + name + " meows...");
        }
    }
}