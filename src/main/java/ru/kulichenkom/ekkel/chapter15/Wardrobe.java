//Ch15Ex34 Создайте самоограничиваемый обобщенный тип с абстрактным методом, который
//получает обобщенный параметр-тип и возвращает обобщенный параметр-тип
//В неабстрактном методе класса вызовите абстрактный метод и верните его результат.
//Используйте наследование от самоограничиваемого типа и протестируйте полученный класс.
package ru.kulichenkom.ekkel.chapter15;

abstract class Furniture<T extends Furniture<T>> {
    abstract T open(T arg);

    public T fill(T arg) {
        System.out.println("fill(T arg)");
        return open(arg);
    }
}

class Wardrobe extends Furniture<Wardrobe> {

    @Override
    Wardrobe open(Wardrobe arg) {
        return arg;
    }
}

class Exercise34 {
    public static void main(String[] args) {
        Wardrobe pax = new Wardrobe();
        pax.open(pax).fill(pax);
    }
}