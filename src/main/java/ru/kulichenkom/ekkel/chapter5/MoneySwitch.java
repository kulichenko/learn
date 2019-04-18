//Ch5Ex22 Напишите команду switch для перечисления из предыдущего примера (Money.java Ch5Ex21).
//Для каждого конкретного случая выведите расширенное описание конкретной валюты.
//Это последнее задание главы 5: Инициализация и завершение.
package ru.kulichenkom.ekkel.chapter5;

public class MoneySwitch {
    Money nominalValues;

    public MoneySwitch(Money nominalValues) {
        this.nominalValues = nominalValues;
    }

    public static void main(String[] args) {
        MoneySwitch first = new MoneySwitch(Money.FIFTY);
        MoneySwitch second = new MoneySwitch(Money.HUNDRED);
        MoneySwitch third = new MoneySwitch(Money.TWO_HUNDRED);
        MoneySwitch forth = new MoneySwitch(Money.FIVE_HUNDRED);
        MoneySwitch fifth = new MoneySwitch(Money.ONE_THOUSAND);
        MoneySwitch sixth = new MoneySwitch(Money.TWO_THOUSANDS);
        first.describe();
        second.describe();
        third.describe();
        forth.describe();
        fifth.describe();
        sixth.describe();
    }

    private void describe() {
        System.out.print("Номинал: " + nominalValues);
        switch (nominalValues) {
            case FIFTY:
                System.out.println(" рублей, на них изображен Санкт-Петербург");
                break;
            case HUNDRED:
                System.out.println(" рублей, изображение столицы - Москвы");
                break;
            case TWO_HUNDRED:
                System.out.println(" рублей, здесь изображен Севастополь");
                break;
            case FIVE_HUNDRED:
                System.out.println(" рублей, отмечен Архангельск");
                break;
            case ONE_THOUSAND:
                System.out.println(" рублей, изображен город Ярославль");
                break;
            case TWO_THOUSANDS:
            default:
                System.out.println(" рублей, ну а здесь Владивосток");
        }
    }

    public enum Money {
        FIFTY, HUNDRED, TWO_HUNDRED, FIVE_HUNDRED, ONE_THOUSAND, TWO_THOUSANDS
    }
}
    


