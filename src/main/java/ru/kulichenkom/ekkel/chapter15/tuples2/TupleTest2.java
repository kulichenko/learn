package ru.kulichenkom.ekkel.chapter15.tuples2;

import ru.kulichenkom.ekkel.chapter15.tuples.*;

import static ru.kulichenkom.ekkel.chapter15.tuples2.Tuple.tuple;

public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi!", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.01);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        //При попытке сохранить результат f2() в параметризованном объекте
        //TwoTuple компилятор должен выдать пердупреждение
        //Ch15Ex15 Проверьте данное утверждение
        TwoTuple<String, Integer> ttsi2 = f2();//компилятор не выдает ошибок!!!
        System.out.println(ttsi);
        System.out.println(ttsi2);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
