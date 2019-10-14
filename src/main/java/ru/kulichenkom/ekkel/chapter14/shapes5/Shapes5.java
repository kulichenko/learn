//Ch14Ex5 Реализуйте в Shapes.java метод rotate(Shape), который проверяет, не относится
//ли фигура к классу Circle (и если относится, не выполняет ли операцию).
package ru.kulichenkom.ekkel.chapter14.shapes5;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

public class Shapes5 {

    public static void rotate(Shape shape) {
        if (!(shape instanceof Circle)) {
            System.out.println(shape + ".rotate()");
        } else {
            System.out.println(shape + " can not rotate()");
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for (Shape shape : shapeList) {
            shape.draw();
            rotate(shape);
        }
    }
}