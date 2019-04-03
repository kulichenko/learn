// упражнение 7 глава 2. Превратите фрагменты кода с классом Incrementable в работающую программу
// упражнение 8 глава 2. Напишите программу, которая демонстрирует, что независимо от созданных объектов класс содержит
// только 1 экземпляр поля Static. В учебнике приведен следующий код:
//class Incrementable {
//static void increment() { StaticTest.i++; }
//}
//Incrementable sf = new Incrementable();
//sf.increment();
//Or, because increment( ) is a static method, you can call it directly through its class:
//Incrementable.increment();
package ru.kulichenkom;

public class Incrementable {

    static int i = 100;

    static int increment() {
        return Incrementable.i++;
    }

    public static void main(String[] args) {
        Incrementable st1 = new Incrementable();
        Incrementable st2 = new Incrementable();
        System.out.println("You can see that st1=" + i + " as well as st2=" + i);
        Incrementable.increment();
        System.out.println("But you know that increment() increase variable. Look at this: " + Incrementable.increment());
    }
}
