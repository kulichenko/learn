//Ch15Ex32 Убедитесь в том, что FixedSizeStack в GenericCast генерирует предупреждения при попытке выхода за границы.
//Означает ли это, что код проверки границ не обязателен.
package ru.kulichenkom.ekkel.chapter15;

class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;


    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage[--index];
    }

    public int getIndex() {
        return index;
    }
}


public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<>(SIZE);
        for (String s : "A B C D E F G H I J".split(" ")) {
            strings.push(s);
        }
//        strings.push("M");
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        //Код проверки границ обязателен
        if (strings.getIndex() < SIZE) {
            strings.push("M");
        }
        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
} /* Output:
J I H G F E D C B A
*///:~