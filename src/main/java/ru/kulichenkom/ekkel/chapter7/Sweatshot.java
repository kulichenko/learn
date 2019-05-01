//Ch7Ex5 Создайте два класса А и В, имеющие конструкторы по умолчанию, которые выводят сообщения
//о вызове. Создайте новый класс С, производный от А. Создайте в С поле типа В.
// Не создавайте конструктор С. Создайте объект класса С и проследите за происходящим.
//
package ru.kulichenkom.ekkel.chapter7;

class Clothes {
    public Clothes() {
        System.out.println("class Clothes");
    }
}

class Sweater {
    public Sweater() {
        System.out.println("class Sweater");
    }
}

public class Sweatshot extends Clothes {
    private Sweater wool;

    public static void main(String[] args) {
        Sweatshot sweatshot = new Sweatshot();
    }
}
