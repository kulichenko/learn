//Ch11Ex3 Измените пример innerclasses/Sequence.java так, чтобы в контейнер
// можно было добавить произвольное количество элементов

package ru.kulichenkom.ekkel.chapter11;

import java.util.ArrayList;
import java.util.List;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private List<Object> items;
    private int next = 0;

    public Sequence() {
        this.items = new ArrayList<>();
    }

    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 5; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        sequence.add(100);
        sequence.add(200);
        sequence.add("The End");
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
