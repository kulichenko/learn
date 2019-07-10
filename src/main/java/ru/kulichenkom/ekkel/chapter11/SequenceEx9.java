//Ch11Ex9 Измените пример innerclasses/Sequence.java так, чтобы контейнер
// Sequence.java работал с Iterator вместо Selector
//***********************************************************************
//interface Selector {
//  boolean end();
//  Object current();
//  void next();
//}
//
//public class Sequence {
//  private Object[] items;
//  private int next = 0;
//  public Sequence(int size) { items = new Object[size]; }
//  public void add(Object x) {
//    if(next < items.length)
//      items[next++] = x;
//  }
//  private class SequenceSelector implements Selector {
//    private int i = 0;
//    public boolean end() { return i == items.length; }
//    public Object current() { return items[i]; }
//    public void next() { if(i < items.length) i++; }
//  }
//  public Selector selector() {
//    return new SequenceSelector();
//  }
//  public static void main(String[] args) {
//    Sequence sequence = new Sequence(10);
//    for(int i = 0; i < 10; i++)
//      sequence.add(Integer.toString(i));
//    Selector selector = sequence.selector();
//    while(!selector.end()) {
//      System.out.print(selector.current() + " ");
//      selector.next();
//    }
//  }
//}
package ru.kulichenkom.ekkel.chapter11;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SequenceEx9 {
    private List<Object> items = new ArrayList<>();

    public static void main(String[] args) {
        SequenceEx9 sequenceEx9 = new SequenceEx9();
        for (int i = 0; i < 5; i++) {
            sequenceEx9.add(i);
        }
        Iterator iterator = sequenceEx9.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }
}
