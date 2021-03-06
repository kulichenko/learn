//CH14EX3 Добавьте класс Rhomboid в иерархию Shapes3. Создайте объект Rhomboid, выполните восходящее
// преобразование его в Shape, а затем снова верните его к классу Rhomboid нисходящим преобразованием.
//Попробуйте выполнить нисходящее преобразование к Circle и объясните, что при этом происходит.
///------------------
//CH14EX4 Измените предыдущий пример так, чтобы перед нисходящим преобразованием
//в нем использовался оператор instanceof для проверки типа
package ru.kulichenkom.ekkel.chapter14.shapes;

//: typeinfo/Shapes.java

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

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes3 {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapeList) {
            shape.draw();
        }
        Rhomboid rhomboid = new Rhomboid();

        Shape shape1 = rhomboid;
        shape1.draw();

        if (shape1 instanceof Circle) {
            shape1.draw();
        } else if (!(shape1 instanceof Circle)) {
            System.out.println("(Shape)rhomboid это не Circle");
        }
    }
}