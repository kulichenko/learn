//Ch11Ex28 Заполните контейнер PriorityQueue (с использованием метода offer() значениями Double,
//созданными генератором java.util.Random. Извлеките элементы из очереди методом poll() и выведите их.
package ru.kulichenkom.ekkel.chapter11;

import java.util.PriorityQueue;
import java.util.Random;

public class Exercise28 {

    public static void callPriorityQueue(PriorityQueue<Double> priorityQueue) {
        for (int i = 0; i < 10; i++) {
            System.out.println(priorityQueue.poll());
        }
    }

    public static void fillPriorityQueue(PriorityQueue<Double> priorityQueue) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextDouble());
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Double> prQueue = new PriorityQueue<>();
        fillPriorityQueue(prQueue);
        callPriorityQueue(prQueue);
    }
}