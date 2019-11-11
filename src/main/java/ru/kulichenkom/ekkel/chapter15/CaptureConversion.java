//Есть ситуация, в которй использование <?> вместо неспециализированного типа особенно принципиально.
//Если передать неспециализированный тип методу использующему <?>, компилятор может автоматически вычислить
//фактический параметр-тип и вызвать другой метод, использующий другой тип.
//
// Пример этого механизма - фиксация, потому как неуказанный тип маски фиксируется и преобразуется к точному типу.
package ru.kulichenkom.ekkel.chapter15;

//: generics/CaptureConversion.java

public class CaptureConversion {
    //все параметры-типы f1() являются точными, не содержат масок или ограничений.
    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    //В f2() параметр Holder является неограниченной маской, так что на первый взгляд он фактически неизвестен.
    //Однако в f2() вызывается метод f1()? которому требуется известный параметр. Здесь параметр-тип фиксируется в
    //процессе вызова f2() и может использоваться при вызове f1().

    static void f2(Holder<?> holder) {
        f1(holder); // Вызов с зафиксированным типом Call with captured type
    }

    //Нельзя ли использовать эту методику для записи? Для этого вместе с Holder<?> необходимо передавать
    //конкретный тип. Фиксация работает только в тех случаях, когда внутри метода необходимо работать с точным типом.
    //Учтите, что вы не можете вернуть T из f2(),  потому что тип Т неизвестен для f2().

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw); // Produces warnings
        f2(raw); // No warnings
        Holder rawBasic = new Holder();
        rawBasic.set(new Object()); // Warning
        f2(rawBasic); // No warnings
        // Upcast to Holder<?>, still figures it out:
        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
} /* Output:
Integer
Object
Double
*///:~