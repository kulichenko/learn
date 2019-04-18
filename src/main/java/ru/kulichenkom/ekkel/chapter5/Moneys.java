//Ch5Ex21 Создайте перечисление с названием 6 типов бумажных денег.
//Переберите результат nominalValues() с выводом каждого значения и его ordinal().
package ru.kulichenkom.ekkel.chapter5;

public class Moneys {
    public static void main(String[] args) {
        for (Money money : Money.values()) {
            System.out.println(money + " " + money.ordinal());
        }
    }

    public enum Money {
        FIFTY, HUNDRED, TWO_HUNDRED, FIVE_HUNDRED, ONE_THOUSAND, TWO_THOUSANDS
    }
}
