package ru.kulichenkom.ekkel.chapter17;

//: containers/CollectionMethods.java
// Things you can do with all Collections.

import ru.kulichenkom.utils.Countries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.addAll(Countries.names(6));
        stringCollection.add("ten");
        stringCollection.add("eleven");
        System.out.println(stringCollection);
        // Make an array from the List:
        Object[] array = stringCollection.toArray();
        // Make a String array from the List:
        String[] str = stringCollection.toArray(new String[0]);
        // Find max and min elements; this means
        // different things depending on the way
        // the Comparable interface is implemented:
        System.out.println("Collections.max(stringCollection) = " + Collections.max(stringCollection));
        System.out.println("Collections.min(stringCollection) = " + Collections.min(stringCollection));
        // Add a Collection to another Collection
        Collection<String> c2 = new ArrayList<>();
        c2.addAll(Countries.names(6));
        stringCollection.addAll(c2);
        System.out.println(stringCollection);
        stringCollection.remove(Countries.DATA[0][0]);
        System.out.println(stringCollection);
        stringCollection.remove(Countries.DATA[1][0]);
        System.out.println(stringCollection);
        // Remove all components that are
        // in the argument collection:
        stringCollection.removeAll(c2);
        System.out.println(stringCollection);
        stringCollection.addAll(c2);
        System.out.println(stringCollection);
        // Is an element in this Collection?
        String val = Countries.DATA[3][0];
        System.out.println("stringCollection.contains(" + val + ") = " + stringCollection.contains(val));
        // Is a Collection in this Collection?
        System.out.println("stringCollection.containsAll(c2) = " + stringCollection.containsAll(c2));
        Collection<String> c3 = ((List<String>) stringCollection).subList(3, 5);
        // Keep all the elements that are in both
        // c2 and c3 (an intersection of sets):
        c2.retainAll(c3);
        System.out.println(c2);
        // Throw away all the elements
        // in c2 that also appear in c3:
        c2.removeAll(c3);
        System.out.println("c2.isEmpty() = " + c2.isEmpty());
        stringCollection = new ArrayList<String>();
        stringCollection.addAll(Countries.names(6));
        System.out.println(stringCollection);
        stringCollection.clear(); // Remove all elements
        System.out.println("after stringCollection.clear():" + stringCollection);
    }
}
