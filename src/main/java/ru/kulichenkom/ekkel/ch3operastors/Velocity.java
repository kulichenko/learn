//Ch3Ex4 Напишите программу, которая вычисляет скорость для постоянных значений расстояния и времени
package ru.kulichenkom.ekkel.ch3operastors;

import java.util.Scanner;

public class Velocity {
    public static double distance, time;

    static double velocityCalculateX5() {
        return distance = distance * 5;
    }

    public static void main(String[] args) {
        System.out.println("Enter distance");
        Scanner in = new Scanner(System.in);
        distance = in.nextDouble();
        System.out.println("Enter time");
        time = in.nextDouble();
        System.out.println("Time is " + time + " Distance is " + distance + "\n Velocity is " + distance / time + "\n");
        velocityCalculateX5();
        System.out.println("Time is " + time + " Distance is " + distance + "\n Velocity is " + distance / time);
    }
}
