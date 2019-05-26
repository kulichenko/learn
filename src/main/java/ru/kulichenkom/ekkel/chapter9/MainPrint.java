//Ch9Ex3 Создайте базовый класс с определением метода abstract print(), переопределяемого производными классами.
//Переопределенная версия метода выводит значение переменной int, определенной в производном классе.
//В точке определения этой переменной присвойте ей нулевое значение. Вызовите этот метод в конструкторе
//базового класса. В методе main() создайте объект производного типа, а затем вызовите его метод
//print(). Объясните результат работы программы.

package ru.kulichenkom.ekkel.chapter9;

abstract class Printer {
    public Printer() {
        print();
    }

    public abstract void print();
}

class LaserJet extends Printer {
    private int copyOfSheets = 0;

    @Override
    public void print() {
        System.out.println("copy of sheets: " + copyOfSheets);
    }
}

public class MainPrint {
    public static void main(String[] args) {
        LaserJet laserJet = new LaserJet();
        laserJet.print();
    }
}