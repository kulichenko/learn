//Ch8Ex4 Добавьте новый подтип Shape к программе Shapes.java (добавил Ellipse)
// и проверьте на меотде main(), что полиморфизм работает правильно
// для вашего нового типа, так же как и для старых типов.
package ru.kulichenkom.ekkel.chapter8.shape;

public class Ellipse extends Shape {
    @Override
    public void draw() {
        System.out.println("Ellipse.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Ellipse.erase()");
    }

    @Override
    public void move() {
        System.out.println("Ellipse.move()");
    }
}
