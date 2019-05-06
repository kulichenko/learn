//Ch8Ex2 Добавьте аннотацию @Override в пример с фигурами.
package ru.kulichenkom.ekkel.chapter8.shape;

import java.util.Random;

public class RandomShapeGenerator {
    private Random rand = new Random();

    public Shape next() {
        switch (rand.nextInt(4)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Ellipse();
            default:
                return null;
        }
    }
}
