package ru.kulichenkom.ekkel.chapter15;

interface OrdinaryGetter {
    Base get();
}

interface DerivedGetter extends OrdinaryGetter {
    //Возвращаемый тип переопределеннного метода может изменяться
    Derived get();
}

interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter> {
}

interface SelfBoundSetter<T extends SelfBoundSetter<T>> {
    void set(T arg);
}

//Самоограничиваемое обобщение  действительно производит для возвращаемого значения
//точный производный тип, как видно из get():
//generics/GenericsAndReturnTypes.java

interface Setter extends SelfBoundSetter<Setter> {
}

class Base {
}

class Derived extends Base {
}

//: generics/OrdinaryArguments.java

public class CovariantReturnTypes {
    public void test(DerivedGetter derivedGetter) {
        Derived derived = derivedGetter.get();
    }
}

class GenericsAndReturnTypes {
    static void test(Getter getter) {
        Getter result = getter.get();
        GenericGetter genericGetter = getter.get();
    }
}

class OrdinarySetter {
    void set(Base base) {
        System.out.println("OrdinarySetter.set(Base)");
    }
}
//Оба вызова - set(derived) и set(base) - допустимы, так что DerivedSetter.set()
//не переопределяет OrdinarySetter.set(), а перегружает этот метод, в DerivedSetter содержится 2 метода.
//Однако с самоограничиваемыми типами в производном классе содержится только 1 метод,
//в аргументе которого передается производный, а не базовый тип
//: generics/SelfBoundingAndCovariantArguments.java

class DerivedSetter extends OrdinarySetter {
    void set(Derived derived) {
        System.out.println("DerivedSetter.set(Derived)");
    }
}

class OrdinaryArguments {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived);
        ds.set(base); // Компилируется: перегрузка, не переопределение!
    }
}

class SelfBoundingAndCovariantArguments {
    void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
        s1.set(s2);
        // s1.set(sbs); // Error:
        // set(Setter) in SelfBoundSetter<Setter>
        // cannot be applied to (SelfBoundSetter)
    }
}
//компилятор не распзнает попытку передачи в аргументе set() базового типа, потому что метода
//с такой сигнатурой не существует. Фактически аргумент был переопределен.

//Без самоограничения вступает обычный механизм наследования, и происходит перегрузка
//как и в случае с необобщенным случаем.

//: generics/PlainGenericInheritance.java

class GenericSetter<T> { // Not self-bounded
    void set(T arg) {
        System.out.println("GenericSetter.set(Base)");
    }
}

class DerivedGS extends GenericSetter<Base> {
    void set(Derived derived) {
        System.out.println("DerivedGS.set(Derived)");
    }
}

class PlainGenericInheritance {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS dgs = new DerivedGS();
        dgs.set(derived);
        dgs.set(base); // Compiles: overloaded, not overridden!
    }
}