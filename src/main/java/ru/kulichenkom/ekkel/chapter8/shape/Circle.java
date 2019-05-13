//Ch8Ex2 Добавьте аннотацию @Override в пример с фигурами.
package ru.kulichenkom.ekkel.chapter8.shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
