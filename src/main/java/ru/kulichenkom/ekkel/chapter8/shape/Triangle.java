//Ch8Ex2 Добавьте аннотацию @Override в пример с фигурами.
package ru.kulichenkom.ekkel.chapter8.shape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
