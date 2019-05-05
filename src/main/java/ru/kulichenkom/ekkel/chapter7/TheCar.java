//Ch7Ex15 Создайте класс в пакете. Ваш класс должен содержать метод со спецификатором protected.
//Создайте класс, производный от вашего, и вызовите метод protected из другого метода вашего
//производного класса.
package ru.kulichenkom.ekkel.chapter7;

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    protected void setName(String nm) {
        name = nm;
    }

    public String toString() {
        return "Это автомобиль марки " + name + " в кузове ";
    }
}

public class TheCar extends Car {
    private String typeOfBody;

    public TheCar(String name, String typeOfBody) {
        super(name);
        this.typeOfBody = typeOfBody;
    }

    public static void main(String[] args) {
        TheCar mercedes = new TheCar("Мерседес", "cедан");
        System.out.println(mercedes);
    }

    public void setCar(String name, String typeOfBody) {
        setName(name);
        this.typeOfBody = typeOfBody;
    }

    public String toString() {
        return super.toString() + typeOfBody;
    }
}