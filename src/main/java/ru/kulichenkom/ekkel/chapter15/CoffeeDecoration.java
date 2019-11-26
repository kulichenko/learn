//Ch15Ex38 Создайте простую систему декораторов:
//начните с базового типа Coffee, а затем добавьте декораторы для разных кофейных напитков:
//капучино, с декоративной пенкой, с шоколадом, с карамелью и взбитыми сливками
package ru.kulichenkom.ekkel.chapter15;

class CoffeeEx38 {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}

class Decorator extends CoffeeEx38 {
    protected CoffeeEx38 coffeeEx38;

    public Decorator(CoffeeEx38 coffee) {
        this.coffeeEx38 = coffee;
    }

    public void set(String coffee) {
        coffeeEx38.setType(coffee);
    }

    public String get() {
        return coffeeEx38.getType();
    }
}

class WithDecorativeFoam extends Decorator {
    private final String foam = " С пенкой";

    public WithDecorativeFoam(CoffeeEx38 coffeeEx38) {
        super(coffeeEx38);
    }

    public String getFoam() {
        return foam;
    }
}

class WithChocolate extends Decorator {
    private final String chocolate = "С шоколадом";

    public WithChocolate(CoffeeEx38 coffeeEx38) {
        super(coffeeEx38);
    }

    public String getChocolate() {
        return chocolate;
    }
}

public class CoffeeDecoration {
    public static void main(String[] args) {
        WithDecorativeFoam withDecorativeFoam = new WithDecorativeFoam(new CoffeeEx38());
        WithDecorativeFoam withDecorativeFoam1 = new WithDecorativeFoam(new WithChocolate(new CoffeeEx38()));
//        withDecorativeFoam1.getChocolate(); недоступно
        System.out.println(withDecorativeFoam.getFoam());
        WithChocolate withChocolate = new WithChocolate(new CoffeeEx38());
        WithChocolate withChocolate1 = new WithChocolate(new WithDecorativeFoam(new CoffeeEx38()));
//        withChocolate1.getFoam(); недоступно
        System.out.println(withChocolate.getChocolate());
    }
}