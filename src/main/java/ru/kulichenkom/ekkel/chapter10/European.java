//Ch10Ex13 Создайте класс, не содержащий конструктор по умолчанию
//При этом класс должен содержать конструктор, получающий аргументы.
//Создайте второй класс с методом, который возвращает ссылку на объект первого класса
//Возвращаемый объект должен создаваться посредством анонимного внутреннего
//класса, производного от первого.
package ru.kulichenkom.ekkel.chapter10;

class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String showName() {
        return name;
    }

    public int showAge() {
        return age;
    }
}

public class European {
    public static void main(String[] args) {
        European european = new European();
        System.out.println(european.getHuman(25, "Piter").showName());
        System.out.println(european.getHuman(25, "Piter").showAge());
    }

    public Human getHuman(int age, String name) {
        return new Human(age, name) {
        };
    }
}