//Ch4Ex8 Создайте команду switch, которая выводит сообщение в каждой секции case. Разместите ее
//в цикле for, проверяющем все допустимые значения case. Каждая секция case должна завершаться командой
//break.

package ru.kulichenkom.ekkel.chapter4;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            int voltage = rand.nextInt(381);
            switch (voltage) {
                case 3:
                case 5:
                case 9:
                case 12:
                case 24:
                    System.out.println("DC: " + voltage + " V");
                    break;
                case 127:
                case 220:
                case 380:
                    System.out.println("AC: " + voltage + " V");
                    break;
                default:
                    System.out.println(voltage + " V, Такого не бывает!");
            }
        }
    }
}
