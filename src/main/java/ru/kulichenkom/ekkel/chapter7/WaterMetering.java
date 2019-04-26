//Ch7Ex1 Создайте простой класс. Во втором классе определите ссылку на объект первого класса.
//Используйте отложенную инициализацию для создания экземпляров этого класса.
package ru.kulichenkom.ekkel.chapter7;

import java.util.Scanner;

class Meter {
    private int coldWater, hotWater;

    public Meter() {
        this.coldWater = coldWater;
        this.hotWater = hotWater;
    }

    public String toString() {
        return "The indication of cold water is " + coldWater + "\nThe indication of hot water is " + hotWater;
    }

    public void howMany() {
        if (coldWater == 0) {
            System.out.println("Please, enter indication of cold water meter");
            Scanner in = new Scanner(System.in);
            coldWater = in.nextInt();
            System.out.println("Please, enter indication of hot water meter");
            hotWater = in.nextInt();
        } else
            System.out.println("It's impossible!");
    }
}

public class WaterMetering {
    public static void main(String[] args) {
        Meter indication = new Meter();
        indication.howMany();
        System.out.println(indication);
    }
}
