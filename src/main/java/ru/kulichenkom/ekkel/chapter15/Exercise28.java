//Ch15Ex28 Создайте обобщ класс Generic1<T> с одним методом
//получающим аргумент типа Т. Создайте второй обобщ класс Generic2<T>
//с одним методом, возвращающим аргумент типа Т. Напишите обобщенный метод,
//с контравариативным аргументом первого обобщенного класса, который вызывает его метод.
//Протестируйте на типах библиотеки typeinfo.pets.
package ru.kulichenkom.ekkel.chapter15;

import ru.kulichenkom.ekkel.chapter14.pets.Dog;
import ru.kulichenkom.ekkel.chapter14.pets.Pet;


public class Exercise28 {
    public static void main(String[] args) {
        Exercise28 ex28 = new Exercise28();
        ex28.contraSetT(ex28.new Generic1<Pet>(), new Dog());
        ex28.contraGetT(ex28.new Generic2<Pet>());
    }

    //метод contraSet() имеет ограничение супертипа. Это позволяет безопасно передать типизованный
    //объект обобщенному типу %)
    // В методе contraSet() аргумент имеет тип Generic1<? super T>, так что Generic1 содержит
    //конкретный тип, производный от Т
    public <T> void contraSetT(Generic1<? super T> generic1, T t) {
        generic1.setT(t);
    }

    public <T> void contraGetT(Generic2<? extends T> generic2) {
        generic2.getT();
    }

    class Generic1<T> {
        T t;

        public void setT(T t) {
            this.t = t;
        }
    }

    class Generic2<T> {
        T t;

        public T getT() {
            return t;
        }
    }
}