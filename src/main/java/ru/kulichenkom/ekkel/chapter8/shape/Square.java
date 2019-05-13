//Ch8Ex2 Добавьте аннотацию @Override в пример с фигурами.
//Ch8Ex3 Включите в базовый класс новый метод, выводящий сообщение, но не переопределяйте его
//в производных классах.Объясните результат. Переопределите его в одном из производных классов и
//посмотрите что происходит.
package ru.kulichenkom.ekkel.chapter8.shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void move() {
        System.out.println("Moving the Square");
    }
}
