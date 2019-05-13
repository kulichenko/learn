//Ch8Ex16 Включите класс RectangularGlyph в PolyConstructors.java
//Продемонстрируйте проблему, описанную в этом разделе
//(поведение полиморфных методов при вызове из конструкторов)
package ru.kulichenkom.ekkel.chapter8;

class Glyph {
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    void draw() {
        System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int length = 2;
    private int width = 1;

    RectangularGlyph(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("RoundGlyph.RoundGlyph(), length = " + length + " width = " + width);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), length = " + length + " width = " + width);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(10, 6);
    }
}
