//Ch10Ex6 Создайте интерфейс, содержащий хотя бы один метод, в отдельном пакете.
//Создайте класс в другом пакете. Добавьте защищенный внутренний класс, реализующий интефейс.
//В третьем пакете создайте производный класс; внутри метода верните объект защищенного
//внутреннего класса, преобразованный в интерфейс.
package ru.kulichenkom.ekkel.chapter10.exercise6;

import ru.kulichenkom.ekkel.chapter10.exercise6.interfaces.Content;

public class Parcel {

    protected class Contents implements Content {
        private String things = "Clothes";

        public Contents() {
        }

        @Override
        public String contents() {
            return things;
        }
    }
}
