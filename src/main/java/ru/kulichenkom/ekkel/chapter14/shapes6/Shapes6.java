//Ch14Ex6 Измените пример Shapes.java так, чтобы он мог выделять (установкой
//внутреннего флага) все фигуры некоторого типа. Метод toString() каждого
//класса производного от Shape, должен указывать, находится ли данная фигура в
//"выделенном" состоянии.

package ru.kulichenkom.ekkel.chapter14.shapes6;

import java.util.Arrays;
import java.util.List;

abstract class Shape6 {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle6 extends Shape6 {
    boolean flag = false;

    @Override
    public String toString() {
        return (flag ? "" : "не") + "выделен " + "Circle6";
    }
}

class Square6 extends Shape6 {
    boolean flag = false;

    @Override
    public String toString() {
        return (flag ? "" : "не") + "выделен " + "Square6";
    }
}

class Triangle6 extends Shape6 {
    boolean flag = false;

    @Override
    public String toString() {
        return (flag ? "" : "не") + "выделен " + "Triangle6";
    }
}

public class Shapes6 {
    public static void setFlag(Shape6 shape6) {
        if (shape6 instanceof Square6) {
            ((Square6) shape6).flag = true;
        }
    }

    public static void main(String[] args) {
        List<Shape6> shapeList = Arrays.asList(
                new Circle6(), new Square6(), new Triangle6()
        );
        for (Shape6 shape : shapeList) {
            setFlag(shape);
            shape.draw();
        }
    }
}