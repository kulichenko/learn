//Ch8Ex2 Добавьте аннотацию @Override в пример с фигурами.
//Ch8Ex3 Включите в базовый класс новый метод (move()),
// выводящий сообщение, но не переопределяйте его
//в производных классах.Объясните результат.
// Переопределите его в одном из производных классов (Square) и
//посмотрите что происходит.
//Ch8Ex4 Добавьте новый подтип Shape к программе Shapes.java (добавил Ellipse)
// и проверьте на меотде main(), что полиморфизм работает правильно
// для вашего нового типа, так же как и для старых типов.
package ru.kulichenkom.ekkel.chapter8.shape;

public class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void move() {
        System.out.println("Moving the Shape");
    }

}
