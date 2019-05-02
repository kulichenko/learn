//Ch7Ex9 Создайте класс Root, содержащий экземпляры каждого из классов
//Component1, Component2, Component3 (так же созданных вами). Объявите класс Stem
//производным от класса Root, так, чтобы в нем так же содержаись экземпляры каждого
// из упомянутых классов Component. Каждый класс должен содержать конструктор по
//умолчанию, который выводит сообщение о своем вызове.
package ru.kulichenkom.ekkel.chapter7;

class Component1 {
    public Component1() {
        System.out.println("Component1");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3");
    }
}

class Root {

    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Root() {
        System.out.println("Root");
    }
}

public class Stem extends Root {
    public Stem() {
        System.out.println("Stem");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
