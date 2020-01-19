//Ch17Ex01 Создайте контейнер List (ArrayList и LinkedList) и заполните его данными Countries.
//отсортируйте список и выведите его, затем многократно примените к списку Collections.shuffle().после каждого
//применения выводите содержимое контейнера, чтобы было видно, что метод shuffle() каждый раз переставляет
//элементы списка в разном порядке.
package ru.kulichenkom.ekkel.chapter17;

import ru.kulichenkom.utils.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        //создаем 2 листа
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
//        заполняем листы данными из Countries
        for (int i = 0; i < Countries.DATA.length; i++) {
            arrayList.add(Countries.DATA[i][0]);
            linkedList.add(Countries.DATA[i][1]);
        }
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Countries: " + arrayList);
        System.out.println("Capitals: " + linkedList);
        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        System.out.println("Countries: " + arrayList);
        System.out.println("Capitals: " + linkedList);
        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        System.out.println("Countries: " + arrayList);
        System.out.println("Capitals: " + linkedList);
    }
}
