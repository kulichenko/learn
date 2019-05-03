//Ch7Ex18 Создайте класс, содержащий поля static final и final.
//Продемонстрируйте различия между ними.
//Разницу, я не особо понял. Static final нельзя позже инициализировать.
package ru.kulichenkom.ekkel.chapter7;

public class Ex18 {
    private static final int HEIGHT_OF_MAN = 165;
    private final int age;

    public Ex18(int age) {
        this.age = age;
    }

    public static int getHeightOfMan() {
        return HEIGHT_OF_MAN;
    }

    public static void main(String[] args) {
        Ex18 ex18 = new Ex18(65);
        //ex18.age = 15; Нельзя изменить значение final переменной
        System.out.println("Возраст: " + ex18.getAge() + " лет.");
        System.out.println("Рост: " + getHeightOfMan() + " см.");
    }

    public int getAge() {
        return age;
    }
}
