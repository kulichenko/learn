//Ch15Ex33 Исправьте ошибку GenericCast с помощью ArrayList.
package ru.kulichenkom.ekkel.chapter15;

import java.util.ArrayList;
import java.util.List;

class FixedSizeStack33<T> {
    private int index = 0;
    private List<T> storage;

    public FixedSizeStack33() {
        storage = new ArrayList<>();
    }

    public int count() {
        return storage.size();
    }

    public void push(T item) {
        storage.add(item);
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage.remove(storage.size() - 1);
    }

    public int getIndex() {
        return index;
    }
}


public class GenericCast33 {
    public static void main(String[] args) {

        FixedSizeStack33<String> strings = new FixedSizeStack33<>();
        for (String s : "A B C D E F G H I J".split(" ")) {
            strings.push(s);
        }
        strings.push("M");
        for (int i = 0; i < strings.count(); i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}