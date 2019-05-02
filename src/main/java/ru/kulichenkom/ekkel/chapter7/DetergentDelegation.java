//Ch7Ex11 Измените пример Detergent.java так, чтобы в нем использовалось делегирование

package ru.kulichenkom.ekkel.chapter7;

class Cleanser1 {
    private String s = "Cleanser1";

    public static void main(String[] args) {
        Cleanser1 use1 = new Cleanser1();
        use1.dilute1();
        use1.apply1();
        use1.scrub1();
        System.out.println(use1);
    }

    public void append1(String a) {
        s += a;
    }

    public void dilute1() {
        append1(" dilute1()");
    }

    public void apply1() {
        append1(" apply1()");
    }

    public void scrub1() {
        append1(" scrub1()");
    }

    public String toString() {
        return s;
    }
}

public class DetergentDelegation {
    Cleanser1 cleanser1 = new Cleanser1();
    private String s = "Cleanser1";

    public static void main(String[] args) {
        DetergentDelegation usage1 = new DetergentDelegation();
        usage1.dilute1();
        usage1.apply1();
        usage1.scrub1();
        usage1.foam1();
        System.out.println(usage1);
    }

    public void append1(String a) {
        s += a;
    }

    public void scrub1() {
        cleanser1.scrub1();
    }

    public void foam1() {
        append1(" foam1()");
    }

    public void dilute1() {
        cleanser1.dilute1();
    }

    public void apply1() {
        cleanser1.apply1();
    }

    public String toString() {
        return s + " " + cleanser1;
    }
}
