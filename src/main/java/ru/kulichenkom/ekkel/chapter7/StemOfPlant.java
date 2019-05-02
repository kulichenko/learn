//Ch7Ex10 Измените предыдущее упражнение так, чтобы во всех классах присутствовали лишь
//конструкторы с аргументами.
// Ch7Ex9 Создайте класс Root, содержащий экземпляры каждого из классов
//Component1, Component2, Component3 (так же созданных вами). Объявите класс Stem
//производным от класса Root, так, чтобы в нем так же содержаись экземпляры каждого
// из упомянутых классов Component. Каждый класс должен содержать конструктор по
//умолчанию, который выводит сообщение о своем вызове.
package ru.kulichenkom.ekkel.chapter7;

class Comp1 {
    int leaf;

    public Comp1(int leaf) {
        this.leaf = leaf;
        System.out.println("Comp1 is leaf: " + leaf + " leafs");
    }
}

class Comp2 {
    int twig;

    public Comp2(int twig) {
        this.twig = twig;
        System.out.println("Comp2 is twig: " + twig + " twigs");
    }
}

class Comp3 {
    int ring;

    public Comp3(int ring) {
        this.ring = ring;
        System.out.println("Comp3 is ring: " + ring + " rings");
    }
}

class RootOfPlant {
    int rootQty;
    Comp1 comp1 = new Comp1(150);
    Comp2 comp2 = new Comp2(20);
    Comp3 comp3 = new Comp3(15);

    public RootOfPlant(int rootQty) {
        this.rootQty = rootQty;
        System.out.println("Root system consist of " + rootQty + " roots");
    }
}

public class StemOfPlant extends RootOfPlant {
    int length;

    public StemOfPlant(int rootQty, int length) {
        super(rootQty);
        this.length = length;
        System.out.println("The length Of Stem is " + length + " meters");
    }

    public static void main(String[] args) {
        StemOfPlant stemOfPlant = new StemOfPlant(145, 4);
    }
}
