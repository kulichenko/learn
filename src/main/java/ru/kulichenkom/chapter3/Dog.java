//Ch3Ex5 Создайте класс Dog, содержащий 2 поля String: name и says. В методе main() создайте
// два объекта Dog с разными именами (spot и scruffy) и сообщениями.
// Выведите значения обоих полей для каждого из объектов
//Ch3Ex6 В упражнении 5 создайте новую ссылку на Dog и присвойте ее объекту spot. Сравните ссылки оператором == и методом equals().
package ru.kulichenkom.chapter3;

public class Dog {

    String name, says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "Spot";
        scruffy.name = "Scruffy";
        spot.says = "Hello!";
        scruffy.says = "Good morning!";
        System.out.println(spot.name + " said: " + spot.says);
        System.out.println(scruffy.name + " said: " + scruffy.says);
        Dog dog = new Dog();
        spot = dog;
        System.out.println(spot.equals(dog));
        System.out.println(spot == dog);
    }
}
