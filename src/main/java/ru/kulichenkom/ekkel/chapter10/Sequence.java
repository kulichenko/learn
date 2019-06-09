//Ch10Ex2 Создайте класс, который содержит String и метод toString() для вывода хранимой строки.
//Добавьте несколько экземпляров нового класса в объект Sequence (класс сиквенс, интерфейс
//селектор приведены как пример в книге) и выведите их.
package ru.kulichenkom.ekkel.chapter10;

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String toString() {
        return word;
    }
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(new Word(Integer.toString(i)));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        Word wordFirst = new Word("Мир!");
        Word wordSecond = new Word("Труд!");
        Word wordThird = new Word("Май!");
        Sequence message = new Sequence(3);
        message.add(wordFirst);
        message.add(wordSecond);
        message.add(wordThird);
        Selector sel = message.selector();
        while (!sel.end()) {
            System.out.print(sel.current() + " ");
            sel.next();
        }

    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }
}
