//Сh8Ex1 Создайте класс cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//cycle, на примере вызова метода ride().
//Ch8Ex5 В упражнении 1 добавьте к классу cycle метод wheels(), возвращающий количество колес
//каждого транспортного средства. Измените метод ride() так, чтобы вызывал wheels(), и убедитесь в том, что
//полиморфизм успешно работает.
package ru.kulichenkom.ekkel.chapter8.cycle;

public class Cycle {
    private String name = "cycle";
    private int qtyWheels = 0;

    public void toRide() {
        System.out.print("This is cycle with name " + this.name + " and its riding now ");
        wheels();
    }

    public void wheels() {
        System.out.println("on " + qtyWheels + " wheels");
    }
}