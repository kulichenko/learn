//Ch12Ex14 Покжите, что программа OnOffSwitch.java может завершиться сбоем, при возбуждении RunTimeException
// внутри блока try.

package ru.kulichenkom.ekkel.chapter12;

public class OnOffSwitchEx14 {
    private static Switch sw = new Switch();
    private static Integer[] x = new Integer[1]; // добавлен массив

    public static void f(int i) //в метод добавлен аргумент int i
            throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f(x[0]); //добавлен аргумент null
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}

class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
}

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}