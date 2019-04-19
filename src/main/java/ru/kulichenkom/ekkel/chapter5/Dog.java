//Ch5Ex5 Создайте класс Dog с перегруженным методом bark(). Метод должен быть перегружен
//для разных примитивных типов данных с целью вывода сообщения о лае, завывании, поскуливании и т.п.
// в зависимости от версии перегруженного метода. Напишите метод main(), вызывающий все версии.
package ru.kulichenkom.ekkel.chapter5;

public class Dog {
    private void bark(char whining) {
        System.out.println("Это перегруженный метод char " + whining);
    }

    private void bark(byte squeal) {
        System.out.println("Это перегруженный метод byte " + squeal);
    }

    private void bark(short growl) {
        System.out.println("Это перегреженный метод short " + growl);
    }

    private void bark(int howl) {
        System.out.println("Это перегреженный метод int " + howl);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark('s');
        dog.bark((byte) 1);
        dog.bark((short) 200);
        dog.bark(1000);
    }
}

