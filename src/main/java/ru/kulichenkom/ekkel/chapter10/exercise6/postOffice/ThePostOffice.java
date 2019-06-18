//Ch10Ex6 Создайте интерфейс, содержащий хотя бы один метод, в отдельном пакете.
//Создайте класс в другом пакете. Добавьте защищенный внутренний класс, реализующий интефейс.
//В третьем пакете создайте производный класс; внутри метода верните объект защищенного
//внутреннего класса, преобразованный в интерфейс.
package ru.kulichenkom.ekkel.chapter10.exercise6.postOffice;

import ru.kulichenkom.ekkel.chapter10.exercise6.Parcel;
import ru.kulichenkom.ekkel.chapter10.exercise6.interfaces.Content;

public class ThePostOffice extends Parcel {
    public Content getContents() {
        return this.new Contents();
    }

    public static void main(String[] args) {
        ThePostOffice office = new ThePostOffice();
        System.out.println(office.getContents().contents());
    }
}
