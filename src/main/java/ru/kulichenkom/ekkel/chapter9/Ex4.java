//Ch9Ex4 Создайте абстрактный класс без методов. Произведите от него класс
// и добавьте метод. Создайте статический метод, получающий ссылку на
// базовый класс, проведите нисходящее преобразование к производному типу
// и вызовите его метод. Продемонстрируйте, что такой способ работает в
// методе main(). Теперь поместите в определение метода из базового класса
// ключевое слово abstract, и необходимость в нисходящем преобразовании исчезнет.
package ru.kulichenkom.ekkel.chapter9;

abstract class LivingCreature {
    abstract void speak(); //добавлен абстрактный метод
}

class Human extends LivingCreature {
    public void speak() {
        System.out.println("Human is speaking.");
    }
}

public class Ex4 {
    public static void getLink(LivingCreature livingCreature) {
//        ((Human)livingCreature).speak(); // До размещения абстрактного метода в базовый класс требовалось нисходящее преобразование
        livingCreature.speak();
    }

    public static void main(String[] args) {
        Human human = new Human();
        Ex4.getLink(human);
    }
}
