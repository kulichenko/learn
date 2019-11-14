//Ch15Ex30 Создайте объект Holder для каждой "обертки" примитивного типа.
//Продемонстрируйте, что автоматическая упаковка и распаковка работает для
// методов set() и get () каждого экземпляра.

package ru.kulichenkom.ekkel.chapter15;

public class HolderForPrimitives {
    public static void main(String[] args) {
        Holder<Integer> integerHolder = new Holder<>();
        integerHolder.set(12);
        System.out.println(integerHolder.get());
        System.out.println(integerHolder.get().getClass());
        int i = integerHolder.get();
        System.out.println("i = " + i);
        Holder<Character> characterHolder = new Holder<>();
        characterHolder.set('D');
        System.out.println(characterHolder.get());
        System.out.println(characterHolder.get().getClass());
        char c = characterHolder.get();
        System.out.println("c = " + c);
        Holder<Byte> byteHolder = new Holder<>();
        byte b = 1;
        byteHolder.set(b);
        System.out.println(byteHolder.get());
        System.out.println(byteHolder.get().getClass());
        byte b1 = byteHolder.get();
        System.out.println("b1 = " + b1);
        Holder<Double> doubleHolder = new Holder<>();
        doubleHolder.set(15.25);
        System.out.println(doubleHolder.get());
        System.out.println(doubleHolder.get().getClass());
        double d = doubleHolder.get();
        System.out.println("d = " + d);
        Holder<Long> longHolder = new Holder<>();
        longHolder.set(10251L);
        System.out.println(longHolder.get());
        System.out.println(longHolder.get().getClass());
        long l = longHolder.get();
        System.out.println("l = " + l);
        Holder<Float> floatHolder = new Holder<>();
        floatHolder.set(154.4461f);
        System.out.println(floatHolder.get());
        System.out.println(floatHolder.get().getClass());
        float f = floatHolder.get();
        System.out.println("f = " + f);
        Holder<Boolean> booleanHolder = new Holder<>();
        booleanHolder.set(true);
        System.out.println(booleanHolder.get());
        System.out.println(booleanHolder.get().getClass());
        boolean bool = booleanHolder.get();
        System.out.println("bool = " + bool);
        Holder<Short> shortHolder = new Holder<>();
        shortHolder.set((short) 456);
        System.out.println(shortHolder.get());
        System.out.println(shortHolder.get().getClass());
        short s = shortHolder.get();
        System.out.println("s = " + s);
    }
}