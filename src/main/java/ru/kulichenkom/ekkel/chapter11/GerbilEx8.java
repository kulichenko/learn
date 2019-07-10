//Ch11Ex8 Измените упражнение 1 так, чтобы для перемещения по контейнеру
//List при вызовах hop() использовался Iterator.
//
//ch11ex1 создайте новый класс с именем Gerbil и поле с именем gerbilNumber типа int,
//инициализируемый в конструкторе. Определите в нем метод hop(), который выводит
//значение gerbilNumber и короткое сообщение. Создайте контейнер
//ArrayList и добавьте в него объекты Gerbil. Используйте метод get() для перебора
//элементов и вызова hop() для каждого объекта Gerbil.
package ru.kulichenkom.ekkel.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerbilEx8 {
    private static int gerbilNumber;

    public GerbilEx8(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public static void hop(Iterator<Gerbil> iterator) {
        while (iterator.hasNext()) {
            Gerbil gerbil = iterator.next();
            System.out.println("Gerbil " + gerbilNumber + " hops");
            gerbilNumber++;
        }
    }

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        hop(gerbils.iterator());
    }
}