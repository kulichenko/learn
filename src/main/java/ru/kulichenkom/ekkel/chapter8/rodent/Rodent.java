//Ch8Ex9 Создайте иерархию наследования, используя в качестве основы различные типы грызунов (Rodent).
//В базовом классе определите несколько общих методов, которые затем переопределите
//в производных классах, для того, чтобы они производили действие, свойственное конкретному
//типу объекта. Создайте массив из объектов Rodent, заполните его различными производными типами
//и вызовите методы базового класса, чтобы увидеть результат работы программы.

package ru.kulichenkom.ekkel.chapter8.rodent;

public class Rodent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(getName() + " фшух");
    }

    public void eat() {
        System.out.println(getName() + " ест...");
    }

    public void gnow() {
        System.out.println(getName() + " грызет...");
    }
}
