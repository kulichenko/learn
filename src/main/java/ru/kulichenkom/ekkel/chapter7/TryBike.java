//Ch7Ex13 Создайте класс с троекратно перегруженным методом (Bike.java).
// Объявите новый класс (TryBike.java) производным от него,
//добавьте новую перегрузку метода и покажите, что все четыре метода доступны в производом классе.
package ru.kulichenkom.ekkel.chapter7;

public class TryBike extends Bike {
    private String recommendation;

    public static void main(String[] args) {
        TryBike tryBike = new TryBike();
        tryBike.movement("Теоретически вы можете разогнаться до ", 3, 8, 50);
        tryBike.movement(3, 9);
        tryBike.movement(45, 3, 7);
        tryBike.movement("Не рекомендую вам разгоняться выше ", 3, 6, 40);
    }

    public void movement(String recommendation, int velocity) {
        System.out.println(recommendation + " " + velocity);
    }
}
