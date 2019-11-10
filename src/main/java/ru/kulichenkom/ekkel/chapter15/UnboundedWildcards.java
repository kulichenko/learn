package ru.kulichenkom.ekkel.chapter15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnboundedWildcards {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list) {
        list1 = list;
        list2 = list;
//        list3 = list; //Предупреждение: неконтролируемое преобразование
//    // Found: List, Required: List<? extends Object>
    }

    static void assign2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList());
//        assign3(new ArrayList());//Предупреждение: неконтролируемое преобразование
        // Found: List, Required: List<? extends Object>
        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());
        //Обе формы допустимы как List<?>
        List<?> wildList = new ArrayList();
        wildList = new ArrayList<String>();
        assign1(wildList);
        assign2(wildList);
        assign3(wildList);
    }
}
//Во многих ситуациях компилятор дейтв не волнует используете ли вы сам тип или <?>. В таких случаях
// <?> можно рассматривать как украшение. Тем не менее маска все же полезна, так как она говорит:
// "Этот код написан с учетом обобщений Java, и здесь имеется ввиду, что в обобщенном параметре
// можно передавать любой тип". С несколькими обобщеннымми параметрами иногда бывает важно разрешить
// для одного параметра любые типы, а для другого - конкретный тип.

//: generics/UnboundedWildcards2.java
class UnboundedWildcards2 {
    static Map map1;
    static Map<?, ?> map2;
    static Map<String, ?> map3;

    static void assign1(Map map) {
        map1 = map;
    }

    static void assign2(Map<?, ?> map) {
        map2 = map;
    }

    static void assign3(Map<String, ?> map) {
        map3 = map;
    }

    public static void main(String[] args) {
        assign1(new HashMap());
        assign2(new HashMap());
        // assign3(new HashMap()); // Warning:
        // Unchecked conversion. Found: HashMap
        // Required: Map<String,?>
        assign1(new HashMap<String, Integer>());
        assign2(new HashMap<String, Integer>());
        assign3(new HashMap<String, Integer>());
    }
}
//Если обобщение состоит только из неограниченных масок <?,?>, компилятор, похоже, не отличает его от обычного
// типа Map. Кроме того компилятор по-разному рассматривет List<?> и List<? extends Object> (первый пример).
//List<?> кажется эквиваленотом List<Object> из-за стирания обобщенного аргумента. List<?> означает "специа
//лизация List для конкретного типа, который нам неизвестен".
//Когда компилятор различает неспециализированные типы (raw) и типы с неограниченными масками?
//В следующем примере используется опеределенный ранее класс Holder<T>. Он содержит методы, которые получают
//аргумент Holder, но в разных формах: неспециализированный тип, с конкретным параметром-типом и с неограниченной
//маской:

//: generics/Holder.java

class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }
}
//: generics/Wildcards.java
// Exploring the meaning of wildcards.

class Wildcards {
    // Raw argument/неспециализированный аргумент:
    static void rawArgs(Holder holder, Object arg) {
        // holder.set(arg); // Warning:
        //   Unchecked call to set(T) as a
        //   member of the raw type Holder
        // holder.set(new Wildcards()); // Same warning
        // Can't do this; don't have any 'T':
        // T t = holder.get();
        // OK, but type information has been lost:
        Object obj = holder.get();
    } //каждый раз, когда вы используете неспециализированный тип, вы отказываетесь от проверки на стадии компиляции.
    //при этом в следующем методе unboundedArg() используется неспециализированный тип Holder<?> и в данном случае
    // метод выявляет те же проблемы, но уже сообщает об ошибках, а не о предупреждениях. Неспециализированный тип
    // Holder может содержать комбинацию любых типов, а Holder<?> содержит однородную коллекцию некоторого
    // конкретного типа, а следовательно, передать Object просто не получится.

    // Аналогично rawArgs(), но с выдачей ошибок вместо предупреждений:
    static void unboundedArg(Holder<?> holder, Object arg) {
        // holder.set(arg); // Error:
        //   set(capture of ?) in Holder<capture of ?>
        //   не может применяться к (Object)
        // holder.set(new Wildcards()); // Same error

        // Can't do this; don't have any 'T':
        // T t = holder.get();

        // OK, but type information has been lost:
        Object obj = holder.get();
    }

    //exact1() и exact2() используют точные параметры обобщений - без масок.
    //exact2() имеет другие ограничения, чем exact1()
    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    //В wildSubtype() ограничения для типа Holder ослабляются до Holder для любых типов, расширяющих T.
    //Все что выходит из Holder<? extends Fruit> будет по меньшей мере Fruit, поэтому get (или любой другой метод,
    // возвращающий параметр тип) разрешен.
    static <T>
    T wildSubtype(Holder<? extends T> holder, T arg) {
        // holder.set(arg); // Error:
        //   set(capture of ? extends T) in
        //   Holder<capture of ? extends T>
        //   cannot be applied to (T)
        T t = holder.get();
        return t;
    }

    //Поведение маски супертипа продемонстрировано в методе wildSupertype(), оно обратно поведению
    //wildSubtype(): holder может содердать контейнер любого типа, который является разновидностью
    //базового класса Т. set() может принять Т, как все, что работает с базовым типом, будет работать
    //полиморфно с производным типом. get() пользы не принесет, так тип, хранимый в holder, может быть абсолютно
    //любым супертипом, поэтому единственным безопасным вариантом является Object.
    static <T> void wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        // T t = holder.get();  // Error:
        //   Incompatible types: found Object, required T

        // OK, but type information has been lost:
        Object obj = holder.get();
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();
        // Or:
        raw = new Holder();
        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<>();
        Long lng = 1L;

        //принимает все разновидности Holder без выдачи предупреждений
        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);

        //принимает все разновидности Holder без выдачи предупреждений, хотя в теле метода он работате с ними иначе
        unboundedArg(raw, lng);
        unboundedArg(qualified, lng);
        unboundedArg(unbounded, lng);
        unboundedArg(bounded, lng);

        // Object r1 = exact1(raw); // Warnings:
        //   Unchecked conversion from Holder to Holder<T>
        //   Unchecked method invocation: exact1(Holder<T>)
        //   is applied to (Holder)
        Long r2 = exact1(qualified);
        Object r3 = exact1(unbounded); // Must return Object
        Long r4 = exact1(bounded);

        // Long r5 = exact2(raw, lng); // Warnings:
        //   Unchecked conversion from Holder to Holder<Long>
        //   Unchecked method invocation: exact2(Holder<T>,T)
        //   is applied to (Holder,Long)
        Long r6 = exact2(qualified, lng);
        // Long r7 = exact2(unbounded, lng); // Error:
        //   exact2(Holder<T>,T) cannot be applied to
        //   (Holder<capture of ?>,Long)
        // Long r8 = exact2(bounded, lng); // Error:
        //   exact2(Holder<T>,T) cannot be applied
        //   to (Holder<capture of ? extends Long>,Long)

        // Long r9 = wildSubtype(raw, lng); // Warnings:
        //   Unchecked conversion from Holder
        //   to Holder<? extends Long>
        //   Unchecked method invocation:
        //   wildSubtype(Holder<? extends T>,T) is
        //   applied to (Holder,Long)
        Long r10 = wildSubtype(qualified, lng);
        // OK, but can only return Object:
        Object r11 = wildSubtype(unbounded, lng);
        Long r12 = wildSubtype(bounded, lng);

        // wildSupertype(raw, lng); // Warnings:
        //   Unchecked conversion from Holder
        //   to Holder<? super Long>
        //   Unchecked method invocation:
        //   wildSupertype(Holder<? super T>,T)
        //   is applied to (Holder,Long)
        wildSupertype(qualified, lng);
        // wildSupertype(unbounded, lng); // Error:
        //   wildSupertype(Holder<? super T>,T) cannot be
        //   applied to (Holder<capture of ?>,Long)
        // wildSupertype(bounded, lng); // Error:
        //   wildSupertype(Holder<? super T>,T) cannot be
        //  applied to (Holder<capture of ? extends Long>,Long)
    }
} ///:~