//Ch10Ex1 Измените упражнение 1 так, чтобы класс Outer содержал закрытое поле String
//(инициализируемое в конструкторе), а класс InnerSecond содержал метод toString() для
//вывода этого поля. Создайте объект типа InnerSecond и выведите его.
//Ch10Ex1 Напишите класс с именем Outer, содержащий внутренний класс с именем InnerSecond.
//Добавьте в Outer метод, возвращающий объект типа InnerSecond. В методе main() создайте и
//инициализируйте ссылку на InnerSecond.
package ru.kulichenkom.ekkel.chapter10;

public class OuterSecond {
    private String outerString;

    public OuterSecond(String outerString) {
        this.outerString = outerString;
    }

    public static void main(String[] args) {
        OuterSecond outer = new OuterSecond("private String класса Outer");
        InnerSecond innerSecond = outer.getInnerSecond();
        System.out.println(innerSecond.toString());
    }

    public InnerSecond getInnerSecond() {
        System.out.println("Возращение объекта InnerSecond, getInnerSecond");
        return new InnerSecond();
    }

    class InnerSecond {
        public InnerSecond() {
            System.out.println("Конструктор Класса InnerSecond");
        }

        @Override
        public String toString() {
            System.out.println("Метод toString() возращает String из класса Outer ");
            return outerString;
        }
    }
}