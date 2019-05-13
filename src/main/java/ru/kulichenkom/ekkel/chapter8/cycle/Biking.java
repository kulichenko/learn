/*Ch8Ex18 Используя иерархию Cycle из упражнения 1, включите метод balance()
 * в классы Unicycle и Bicycle, но не в Tricycle. Создайте экземпляры всех
 * трех типов и выполните их восходящее преобразование в массив Cycle.
 * Попробуйтне ввызвать balance() для каждого элемента массива.
 * Теперь выполните нисходящее преобразование, вызовите balance() и проанализируйте результат*/

//Сh8Ex1 Создайте класс cycle с производными классами Unicycle, Bicycle, Tricycle.
//Покажите, что экземпляр каждого из производных типов может быть преобразован в
//cycle, на примере вызова метода ride().
//Ch8Ex5 В упражнении 1 добавьте к классу cycle метод wheels(), возвращающий количество колес
//каждого транспортного средства. Измените метод ride() так, чтобы вызывал wheels(), и убедитесь в том, что
//полиморфизм успешно работает.
package ru.kulichenkom.ekkel.chapter8.cycle;

public class Biking {

    public static void main(String[] args) {
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
//        cycles[0].balance(); - метод нельзя вызвать, так как в базовом классе Cycle не определен
//        cycles[1].balance(); - метод нельзя вызвать, так как в базовом классе Cycle не определен
//        cycles[2].balance(); - метод нельзя вызвать, так как в базовом классе Cycle не определен
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
//        ((Tricycle)cycles[2]).balance(); - метод не определен в Tricycle
    }
}