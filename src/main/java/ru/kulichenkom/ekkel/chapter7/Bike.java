//Ch7Ex13 Создайте класс с троекратно перегруженным методом (Bike.java).
// Объявите новый класс (TryBike.java) производным от него,
//добавьте новую перегрузку метода и покажите, что все четыре метода доступны в производом классе.
package ru.kulichenkom.ekkel.chapter7;

public class Bike {
    private int frontGears, rearGears, velocity;
    private String description;

    public void movement(String description, int frontGears, int rearGears, int velocity) {
        System.out.println(description + velocity + " км/час на передачах " + frontGears + "/" + rearGears);
    }

    public void movement(int frontGears, int rearGears) {
        System.out.println("Включена передняя передача " + frontGears + " и задняя " + rearGears);
    }

    public void movement(int velocity, int frontGears, int rearGears) {
        System.out.println("Вы разогнались до " + velocity + " км/час на передачах " + frontGears + "/" + rearGears);
    }
}
