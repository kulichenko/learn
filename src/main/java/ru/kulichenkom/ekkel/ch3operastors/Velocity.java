//Ch3Ex4 Напишите программу, которая вычисляет скорость для постоянных значений расстояния и времени
package ru.kulichenkom.ekkel.ch3operastors;

import java.util.Scanner;

public class Velocity {

    private double distance, time;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void velocityCalculateX5() {
        distance = distance * 5;
    }

    public static void main(String[] args) {
        Velocity velocity = new Velocity();
        System.out.println("Enter distance");
        Scanner in = new Scanner(System.in);
        velocity.setDistance(in.nextDouble());
        System.out.println("Enter time");
        velocity.setTime(in.nextDouble());
        System.out.println("Time is " + velocity.getTime() + " Distance is " + velocity.getDistance() + "\n Velocity is " + velocity.getDistance() / velocity.getTime() + "\n");
        velocity.velocityCalculateX5();
        System.out.println("Time is " + velocity.getTime() + " Distance is " + velocity.getDistance() + "\n Velocity is " + velocity.getDistance() / velocity.getTime());
    }
}
