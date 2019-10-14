//Ch15Ex5 На базе примера generics/LinkedStack.java. Удалите параметр-тип класса Node и измените остальной код
// LinkedStack.java так, чтобы показать, что для внутреннего класса доступны обобщенные параметры
//типы внешнего класса.

//: generics/LinkedStack.java
// A stack implemented with an internal linked structure.
package ru.kulichenkom.ekkel.chapter15;

public class LinkedStack<T> {
    //    private Node<T> top = new Node<>(); // Сторож
    private Node top = new Node(); // Сторож

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

    public void push(T item) {
//        top = new Node<>(item, top);
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    //    private static class Node<U> {
    private class Node {
        //        U item;
        T item;
        //        Node<U> next;
        Node next;

        Node() {
            item = null;
            next = null;
        }

        //        Node(U item, Node<U> next) {
        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }
}