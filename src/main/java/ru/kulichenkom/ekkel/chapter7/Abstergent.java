//Ch7Ex2 Объявите новый класс, производный от Detergent (классы Cleanser и Detergent
// приведены в книге). Переопределите метод scrub() и добавьте новый метод с именем sterilize().
package ru.kulichenkom.ekkel.chapter7;

class Cleanser {
    private String s = "Cleanser";

    public static void main(String[] args) {
        Cleanser use = new Cleanser();
        use.dilute();
        use.apply();
        use.scrub();
        System.out.println(use);
    }

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }
}

class Detergent extends Cleanser {
    public static void main(String[] args) {
        Detergent usage = new Detergent();
        usage.dilute();
        usage.apply();
        usage.scrub();
        usage.foam();
        System.out.println(usage);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }

    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
        append(" foam()");
    }
}

public class Abstergent extends Detergent {
    public static void main(String[] args) {
        Abstergent abstergent = new Abstergent();
        abstergent.scrub();
        abstergent.sterilize();
        abstergent.foam();
        abstergent.dilute();
        abstergent.apply();
        System.out.println(abstergent);
    }

    public void scrub() {
        append(" Abstergent.scrub()");
        super.scrub(); //Вызов метода базового класса Detergent
    }

    public void sterilize() {
        append(" sterilize()");
    }
}