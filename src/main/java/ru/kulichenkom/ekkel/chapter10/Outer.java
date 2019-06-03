//Ch10Ex1 Напишите класс с именем Outer, содержащий внутренний класс с именем Inner.
//Добавьте в Outer метод, возвращающий объект типа Inner. В методе main() создайте и
//инициализируйте ссылку на Inner.
package ru.kulichenkom.ekkel.chapter10;

public class Outer {
    public Outer() {
        System.out.println("Конструктор класса Outer");
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }

    public Inner getInner() {
        System.out.println("Возращение объекта Inner.");
        return new Inner();
    }

    class Inner {
        public Inner() {
            System.out.println("Конструктор Класса Inner");
        }
    }
}