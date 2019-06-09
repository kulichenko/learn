//Ch10Ex5 Создайте класс с внутренним классом.
//В отдельном классе создайте экземпляр внутреннего класса.
package ru.kulichenkom.ekkel.chapter10;

public class Container {
    private int boxQty;
    private boolean unloaded;

    public Container(int boxQty, boolean unloaded) {
        this.boxQty = boxQty;
        this.unloaded = unloaded;
        System.out.println("Container");
    }

    class Box {
        private String partNumber;
        private int qty;

        public Box(String partNumber, int qty) {
            this.partNumber = partNumber;
            this.qty = qty;
            System.out.println("Box");
        }

        public void info() {
            System.out.println("PartNo " + partNumber + "\nQuantity:" + qty);
        }
    }
}

class Receiving {
    public static void main(String[] args) {
        Container container = new Container(200, false);
        Container.Box box = container.new Box("10001GJ12A", 8);
        box.info();
    }
}