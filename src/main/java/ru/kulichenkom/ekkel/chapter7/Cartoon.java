//Ch7Ex3 Докажите утверждение: Даже если конструктор класса Cartoon не определен,
//компилятор сгенерирует конструктор по умолчанию, в котором также вызывается конструктор
//базового класса.
package ru.kulichenkom.ekkel.chapter7;

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    //public Cartoon() { System.out.println("Cartoon constructor"); }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}