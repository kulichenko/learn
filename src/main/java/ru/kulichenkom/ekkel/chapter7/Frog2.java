//Ch7Ex17 Измените упражнение 16 так, чтобы класс Frog переопределял методы базового класса
//(предоставляя новые определения с той же сигнатурой метода).
//Посмотрите что произойдет в методе main().
// Ch7Ex16 Создайте класс с именем Amphibian. Объявите производный от него
//класс с именем Frog. Разместите в базовом классе несколько методов. В методе main() создайте
//объект Frog, преобразуйте его в Amphibian и продемонстрируйте, что все методы работают
package ru.kulichenkom.ekkel.chapter7;

class Amphibian2 {

    static void grow2(Amphibian2 amphibian2) {
        System.out.println("Земноводное растет");
    }

    public void swim2(int swimming) {
        System.out.println("Проплыть " + swimming + " метров.");
    }

    public void jump2(int jumping) {
        System.out.println("Прыгнуть " + jumping + " раз.");
    }

    public void eat2(boolean eating) {
        System.out.println("Там будет столько вкусного! Правда? " + eating + "!");
    }
}

public class Frog2 extends Amphibian2 {
    static void grow2(Amphibian2 amphibian2) {
        System.out.println("Переопределенный метод grow2(). Земноводное растет");
    }

    public static void main(String[] args) {
        Frog2 frog2 = new Frog2();
        frog2.swim2(25);
        frog2.jump2(35);
        frog2.eat2(true);
        grow2(frog2);
        Amphibian2.grow2(frog2);
    }

    @Override
    public void swim2(int swimming) {
        System.out.println("Переопределенный метод swim2(). Проплыть " + swimming + " метров.");
    }

    @Override
    public void jump2(int jumping) {
        System.out.println("Переопределенный метод jump2(). Прыгнуть " + jumping + " раз.");
    }

    @Override
    public void eat2(boolean eating) {
        System.out.println("Переопределенный метод eat2(). Там будет столько вкусного! Правда? " + eating + "!");
    }
}
