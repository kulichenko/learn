package ru.kulichenkom.sawitch;

import java.util.Scanner;

public class SavitchCh2Ex8 {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        Scanner in = new Scanner(System.in);
        double deegreesF = in.nextDouble();
        double degreesC = 5 * (deegreesF - 32) / 9;
        System.out.println(deegreesF + "degrees F = " + degreesC + " degrees in C");
        in.close();
    }
}
