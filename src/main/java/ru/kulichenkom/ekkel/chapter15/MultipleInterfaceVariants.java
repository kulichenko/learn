package ru.kulichenkom.ekkel.chapter15;

interface Payable<T> {
}

class Employee implements Payable<Employee> {
}
//class Hourly extends Employee implements Payable<Hourly>{}
//Класс Hourly не компилируется, потому что стирание Payable<Employee> и Payable<Hourly>{}
//до одного класса Payable, а приведенный выше код будет означать, что один интерфейс реализуется дважды
//При удалении обобщенных параметров из обоих мест использования Payable код откомпилируется:

//Ch15Ex31 Удалите все обобщения из MultipleInterfaceVariants.java и измените код, чтобы пример откомпилировался.

class Employee31 implements Payable {
}

class Hourly31 extends Employee31 implements Payable {
}

public class MultipleInterfaceVariants {
    public static void main(String[] args) {
        Employee31 hourly31 = new Hourly31();
        System.out.println(hourly31.getClass().getSimpleName());
    }
}
