//Ch15Ex4 "Обобщите" innerclasses/Sequence.java.
package ru.kulichenkom.ekkel.chapter15;

import java.util.ArrayList;
import java.util.List;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence<E> {
    private List<E> list = new ArrayList<>();
    private int next = 0;

    public Sequence(List<E> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        Sequence<Integer> sequence = new Sequence(listInt);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }

    public void add(E e) {
        list.add(e);
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == list.size();
        }

        public Object current() {
            return list.get(i);
        }

        public void next() {
            if (i < list.size()) {
                i++;
            }
        }
    }
}