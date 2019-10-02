package ru.kulichenkom.ekkel.chapter14;
//Ch14Ex21 Измените приемер //: typeinfo/SimpleProxyDemo.java, чтобы в нем измерялось время вызова методов

import java.util.Date;

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    private static long timeDoSth, timeSthElse;

    public void doSomething() {
        timeDoSth = new Date().getTime();
        System.out.println("doSomething on " + new Date());
    }

    public void somethingElse(String arg) {
        timeSthElse = new Date().getTime();
        System.out.println("somethingElse " + arg + " on " + new Date() + " через " + (timeSthElse - timeDoSth) + " мсек");
    }
}

class SimpleProxy implements Interface {
    private static long timeDoSth, timeSthElse;
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        timeDoSth = new Date().getTime();
        System.out.println("SimpleProxy doSomething on " + new Date());
        proxied.doSomething();
    }

    public void somethingElse(String arg) {
        timeSthElse = new Date().getTime();
        System.out.println("SimpleProxy somethingElse " + arg + " on " + new Date() + " через " + (timeSthElse - timeDoSth) + " мсек");
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}