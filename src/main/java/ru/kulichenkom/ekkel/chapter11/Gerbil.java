//ch11ex1 создайте новый класс с именем Gerbil с именем gerbilNumber типа int,
//инициализируемый в конструкторе. Определите в нем метод hop(), который выводит
//значение gerbilNumber и короткое сообщение. Создайте контейнер
//ArrayList и добавьте в него объекты Gerbil. Используйте метод get() для перебора
//элементов и вызова hop() для каждого объекта Gerbil.
package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < 3; i++) {
            gerbils.get(i).hop();
        }
    }
}
