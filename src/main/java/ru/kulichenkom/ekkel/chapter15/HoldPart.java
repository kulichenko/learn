//Ch15Ex2 Создайте класс для храниения трех объектов одного типа, с методами сохраниения и выборки
//этих объектов и конструктором для инициализации всех трех объектов
package ru.kulichenkom.ekkel.chapter15;

public class HoldPart<T> {
    private T part1, part2, part3;

    public HoldPart(T part1, T part2, T part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

    public static void main(String[] args) {
        Part airDuct = new Part("Air Duct");
        Part airBag = new Part("Air Bag");
        Part lamp = new Part("Lamp");
        HoldPart<Part> holdPart = new HoldPart<>(airDuct, airBag, lamp);
        System.out.println(holdPart.getPart1());
        System.out.println(holdPart.getPart2());
        System.out.println(holdPart.getPart3());
    }

    public T getPart1() {
        return part1;
    }

    public void setPart1(T part1) {
        this.part1 = part1;
    }

    public T getPart2() {
        return part2;
    }

    public void setPart2(T part2) {
        this.part2 = part2;
    }

    public T getPart3() {
        return part3;
    }

    public void setPart3(T part3) {
        this.part3 = part3;
    }
}

class Part {
    private String name;

    public Part(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}