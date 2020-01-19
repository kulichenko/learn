//Ch17Ex07 page 659. Создайте объекты ArrayList и LinkedList, заполните каждый из них с использованием
// генератора Countries.names(). Выведите списки с использованием обычного итератора Iterator, затем вставьте
//один список в другой с использованием ListIterator, выполняя вставку через позицию.
//Теперь выполните вставку, начиная от конца первого списка и перемещаясь в обратном направлении.
package ru.kulichenkom.ekkel.chapter17;

import ru.kulichenkom.utils.Countries;

import java.util.*;

public class Exercise07 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Countries.names(8)); //Если arrayList изначально меньше, чем linkedList, то в конце получаем exception
        List<String> linkedList = new LinkedList<>(Countries.names(7));
        System.out.println(arrayList);
        System.out.println(linkedList);
        Iterator arrayListIterator = arrayList.iterator();
        Iterator linkedListIterator = linkedList.iterator();
        System.out.println("----");
        while (arrayListIterator.hasNext()) {
            System.out.print(arrayListIterator.next() + " ");
        }
        System.out.println();
        System.out.println("----");
        while (linkedListIterator.hasNext()) {
            System.out.print(linkedListIterator.next() + " ");
        }
        ListIterator alIterator = arrayList.listIterator();
        ListIterator llIterator = linkedList.listIterator();
        while (llIterator.hasNext()) {
            alIterator.next();
            alIterator.add(llIterator.next());
        }
        System.out.println();
        System.out.println(arrayList);
    }
}