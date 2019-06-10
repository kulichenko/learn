//Ch10Ex11 Создайте закрытый внутренний класс, реализующий открытый интерфейс.
//Напишите метод, который возвращает ссылку на экземпляр закрытого внутреннего класса,
//преобразованную к интерфейсу восходящим преобразованием. Чтобы показать, что
//внутренний класс полностью скрыт. попробуйте выполнить нисходящее преобразование
//к нему.
package ru.kulichenkom.ekkel.chapter10.tools;

public interface Instrument {
    void makeWork(String work);
}

class Repair {
    Instrument instrument() {
        return new Saw();
    }

    private class Saw implements Instrument {

        @Override
        public void makeWork(String work) {
            System.out.println("Saw is " + work);
        }
    }
}

