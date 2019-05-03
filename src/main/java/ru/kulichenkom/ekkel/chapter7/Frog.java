//Ch7Ex16 Создайте класс с именем Amphibian. Объявите производный от него
//класс с именем Frog. Разместите в базовом классе несколько методов. В методе main() создайте
//объект Frog, преобразуйте его в Amphibian и продемонстрируйте, что все методы работают
package ru.kulichenkom.ekkel.chapter7;

class Amphibian {

    static void grow(Amphibian amphibian) {
        System.out.println("Земноводное растет");
    }

    public void swim(int swimming) {
        System.out.println("Проплыть " + swimming + " метров.");
    }

    public void jump(int jumping) {
        System.out.println("Прыгнуть " + jumping + " раз.");
    }

    public void eat(boolean eating) {
        System.out.println("Там будет столько вкусного! Правда? " + eating + "!");
    }
}

public class Frog extends Amphibian {

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.swim(25);
        frog.jump(35);
        frog.eat(true);
        Amphibian.grow(frog);
    }
}
