//ExampleFromBook : holding/PriorityQueueDemo.java
package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

public class PriorityQueueDemo {
    public static String printQ(PriorityQueue stringPQ) {
        String resultString = "";
        while (!stringPQ.isEmpty()) {
            Object nextSymbol = stringPQ.poll();
            resultString = resultString + nextSymbol + " ";
        }
        System.out.println(resultString);
        return resultString;
    }

    public static String sortStringByPriority(String stringLine) {
        List<String> strings = Arrays.asList(stringLine.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        return printQ(stringPQ);
    }

    public static String reverseStringByPriority(String stringLine) {
        List<String> strings = Arrays.asList(stringLine.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        return printQ(stringPQ);
    }

    public static String sortedSetFromString(String stringLine) {
        Set<Character> charSet = new HashSet<>();
        for (char c : stringLine.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        return printQ(characterPQ);
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        printQ(priorityQueue);
        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        sortStringByPriority(fact);
        reverseStringByPriority(fact);
        sortedSetFromString(fact);
    }
} /* Output:
0 1 1 1 1 1 3 5 8 14
1 1 2 3 3 9 9 14 14 18 18 20 21 22 23 25 25
25 25 23 22 21 20 18 18 14 14 9 9 3 3 2 1 1
       A A B C C C D D E E E F H H I I L N N O O O O S S S T T U U U W
W U U U T T S S S O O O O N N L I I H H F E E E D D C C C B A A
  A B C D E F H I L N O S T U W
*///:~