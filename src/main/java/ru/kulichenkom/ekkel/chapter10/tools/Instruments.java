//Ch10Ex11 Создайте закрытый внутренний класс, реализующий открытый интерфейс.
//Напишите метод, который возвращает ссылку на экземпляр закрытого внутреннего класса,
//преобразованную к интерфейсу восходящим преобразованием. Чтобы показать, что
//внутренний класс полностью скрыт. попробуйте выполнить нисходящее преобразование
//к нему.
package ru.kulichenkom.ekkel.chapter10.tools;

public class Instruments {
    public static void main(String[] args) {
        Repair repair = new Repair();
        repair.instrument().makeWork("sawing...");
//        ((Saw).repair.instrument()).makeWork("sawing..."); Не может найти сивол Saw
    }
}
