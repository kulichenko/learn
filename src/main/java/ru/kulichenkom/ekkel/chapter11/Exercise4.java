//Ch11Ex4 Создайте класс-генератор, который при каждом вызове next()
//выдает имена актеров фильма в виде объектов String. Когда список
//заканчивается, программа снова возвращается к началу. Используйте
//генератор для заполнения массива и контейнеров ArrayList, LinkedList
//HashSet, LinkedHashSet, TreeSet, после чего выведите содержимое каждого контейнера.
package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

class Generator {
    private int counter = 0;

    public String next() {
        switch (counter) {
            case 0:
                counter++;
                return "Никулин";
            case 1:
                counter++;
                return "Моргунов";
            case 2:
                counter++;
                return "Вицин";
            case 3:
                counter++;
                return "Этуш";
            case 4:
                counter++;
                return "Демьяненко";
            case 5:
                counter = 0;
                return "Варлей";
            default:
                return null;
        }
    }

    public void fillArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = next();
        }
    }

    public Collection fillCollect(Collection<String> collection, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(next());
        }
        return collection;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Generator generator = new Generator();
        String[] arr = new String[10];
        generator.fillArray(arr);
        for (String s : arr) {
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println(generator.fillCollect(new ArrayList<>(), 12));
        System.out.println(generator.fillCollect(new LinkedList<>(), 12));
        System.out.println(generator.fillCollect(new HashSet<>(), 12));
        System.out.println(generator.fillCollect(new LinkedHashSet<>(), 12));
        System.out.println(generator.fillCollect(new TreeSet<>(), 120));
    }
}
