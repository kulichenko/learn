//Ch8Ex10 Создайте базовый класс с двумя методами. В 1-м методе вызовите 2-й.
//Опред-те произв-й класс и переопр-те второй метод. Создайте объект произв-го класса
//Выполните восходящее преобразвание к базовому типу и вызовите первый метод. Объясните результат.
package ru.kulichenkom.ekkel.chapter8.human;

public class Student extends Human {
    public Student() {
        setAge(20);
        setName("Александр");
    }

    public static void main(String[] args) {
        Human alexandr = new Student();
        alexandr.live();
    }

    public void doing() {
        setSortOfActivity("студент");
        System.out.println(getName() + " - " + getSortOfActivity());
    }
}
