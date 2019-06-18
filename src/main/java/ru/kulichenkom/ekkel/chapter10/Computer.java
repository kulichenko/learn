//Ch10Ex7 создайте класс, содержащий закрытое поле и закрытый метод.
//Создайте внутренний класс с методом, который изменяет поле внешнего класса
//и вызывает метод внешнего класса. Во втором методе внешнего класса создайте объект
// внутреннего класса и вызовите его метод; продемонстрируйте эффект на объекте внешнего класса.
package ru.kulichenkom.ekkel.chapter10;

public class Computer {
    private String processor = "Intel i7";

    private String typeOfProcessor() {
        return processor;
    }

    public void tryToModify() {
        Modify modify = this.new Modify();
        modify.changeProcessor();
        System.out.println(processor);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("Первоначальный процессор " + computer.typeOfProcessor());
        System.out.print("После замены установлен процессор ");
        computer.tryToModify();
    }

    class Modify {
        public void changeProcessor() {
            processor = "Intel i5";
            typeOfProcessor();
        }
    }
}
