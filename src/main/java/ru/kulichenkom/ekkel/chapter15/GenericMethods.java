package ru.kulichenkom.ekkel.chapter15;

public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
}
//Ch15Ex9 Измените пример GenericMethods.java, чтобы метод f()получал
// три аргумента, относящихся к разным параметризованным типам.

class GenericMethods9 {
    public static void main(String[] args) {
        GenericMethods9 gm9 = new GenericMethods9();
        gm9.f("", 1, 1.0);
        gm9.f(1.0F, 'c', gm9);
    }

    public <T, U, V> void f(T x, U y, V z) {
        System.out.println(x.getClass().getName() + ", " + y.getClass().getName() + ", " + z.getClass().getName());
    }
}

//Ch15Ex10 Измените предыдущее упражнение так, чтобы один из аргументов f() был
//не параметризованным.
class GenericMethods10 {
    public static void main(String[] args) {
        GenericMethods10 gm10 = new GenericMethods10();
        gm10.f("", 1, 1.0);
        gm10.f("Text", 'c', gm10);
    }

    public <U, V> void f(String x, U y, V z) {
        System.out.println(x.getClass().getName() + ", " + y.getClass().getName() + ", " + z.getClass().getName());
    }
}