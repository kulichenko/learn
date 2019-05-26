//Сh9Ex18 Создайте интерфейс Cycle с реализациями Unicycle,Bicycle,Tricycle.
//Создайте фабирку для каждой разновидности Cycle и код, использующий эти фабирики
package ru.kulichenkom.ekkel.chapter9.cycle;

class Unicycle implements Cycle {
    private String name = "unicycle";
    private int qtyWheels = 1;

    public void toRide() {
        System.out.print("This is cycle with name " + this.name + " and its riding now ");
        wheels();
    }

    public void wheels() {
        System.out.println("on " + qtyWheels + " wheel");
    }
}
