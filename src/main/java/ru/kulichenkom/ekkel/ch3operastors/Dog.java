//Ch3Ex5 Создайте класс Dog, содержащий 2 поля String: name и says. В методе main() создайте
// два объекта Dog с разными именами (spot и scruffy) и сообщениями.
// Выведите значения обоих полей для каждого из объектов
//Ch3Ex6 В упражнении 5 создайте новую ссылку на Dog и присвойте ее объекту spot. Сравните ссылки оператором == и методом equals().
package ru.kulichenkom.ekkel.ch3operastors;

public class Dog {

    String name;
    String says;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.setName("Spot");
        scruffy.setName("Scruffy");
        spot.setSays("Hello!");
        scruffy.setSays("Good morning!");
        System.out.println(spot.getName() + " said: " + spot.getSays());
        System.out.println(scruffy.getName() + " said: " + scruffy.getSays());
        Dog dog = new Dog();
        spot = dog;
        System.out.println(spot.equals(dog));
        System.out.println(spot == dog);
    }

}
