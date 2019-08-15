//Ch12Ex5 Создайте собственную реализацию модели возобновления, исп-я цицл while.
//кот-й выполн-ся до тех пор пока, исключение не перестанет выдаваться
package ru.kulichenkom.ekkel.chapter12;

public class FlatsEx5 {
    private static int[] flatNumbers = new int[5];
    private static int index = 10;

    public static void main(String[] args) {
        while (true) {
            try {
                flatNumbers[index] = index + 1;
                System.out.println("Квартира № " + flatNumbers[index]);
                index--;
                if (index == -1) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                index--;
            } finally {
                System.out.println("Еще не все?");
            }
        }
        System.out.println("Все квартиры пронумерованы");
    }
}