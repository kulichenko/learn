//Ch5Ex17 Создайте класс с конструткором, получающим аргумент String.
//Выведите значение аргумента во время конструирования. Создайте массив ссылок на этот класс, но не создавайте
//объекты, которыми заполняетяс массив. Запустите программу и посмотрите, будут ли
//выводится сообщения при вызове конструктора
//Ch5Ex18 Завершите предыдущее упраженение - создайте объекты, которыми заполняется массив ссылок.
package ru.kulichenkom.ekkel.chapter5;

class ArraysOfBird {
    private String bird;

    public String getBird() {
        return bird;
    }

    ArraysOfBird(String bird) {
        this.bird = bird;
        System.out.println(bird);
    }
}

public class ArraysOfString {

    public static void main(String[] args) {
        ArraysOfBird[] forest = new ArraysOfBird[3];
        forest[0] = new ArraysOfBird("Утка");
        forest[1] = new ArraysOfBird("Куропатка");
        forest[2] = new ArraysOfBird("Тетерев");
    }
}
