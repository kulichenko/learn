//Ch3Ex4 Напишите программу, которая вычисляет скорость для постоянных значений расстояния и времени
package ru.kulichenkom.chapter3;

import java.util.Scanner;

public class Velocity {
    static double distance, time;

    static double velocityCalculateX5(Velocity value) {
        return distance = distance * 5;
    }

    public static void main(String[] args) {
        Velocity goplk = new Velocity();
        System.out.println("Enter distance");
        Scanner in = new Scanner(System.in);
        distance = in.nextDouble();
        System.out.println("Enter time");
        time = in.nextDouble();
        System.out.println("Time is " + time + " Distance is " + distance + "\n Velocity is " + distance / time);
        velocityCalculateX5(goplk);
        System.out.println("Time is " + time + " Distance is " + distance + "\n Velocity is " + distance / time);
    }
}
