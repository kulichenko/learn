package ru.kulichenkom.ekkel.chapter15;
//Вторая реализация Generator<T> предназначена для генерации чисел Фибоначчи.
//: generics/Fibonacci.java
// Generate a Fibonacci sequence.

//Ch15Ex7 Используйте композицию вместо наследования при адоптации Fibonacci,
// обеспечивающей поддержку Iterable.

import ru.kulichenkom.ekkel.chapter15.coffee.Generator;

import java.util.Iterator;

public class Fibonacci implements Generator<Integer>, Iterator<Integer> {
    private int count = 0;
    private int m;

    public Fibonacci() {
    }

    public Fibonacci(int m) {
        this.m = m;
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(gen.next() + " ");
        }
        System.out.println();
        Iterator iterator = new Fibonacci(20).iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public Integer next() {
        return fib(count++);
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return m > 0;
            }

            public Integer next() {
                m--;
                return Fibonacci.this.next();
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}

