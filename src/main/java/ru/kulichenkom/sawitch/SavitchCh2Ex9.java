package ru.kulichenkom.sawitch;

import java.util.Scanner;

public class SavitchCh2Ex9 {
    public static void main(String[] args) {
        System.out.println("Enter the cost of the product (from 25 cents to $ 1 in increments of 5 cents) and you give 1$ ");
        Scanner in = new Scanner(System.in);
        int totalCost = in.nextInt();
        int restCents = 100 - totalCost;
        int quarters = restCents / 25;
        int dims = (restCents - 25 * quarters) / 10;
        int nickles = (restCents - 25 * quarters - 10 * dims) / 5;
        System.out.println("You bought an item for " + totalCost + " cents.\n"
                + "This is your change: \n" + quarters + " coins of 25 cents \n" + dims + " coins of 10 cents \n" + nickles + " coins of 5 cents \n");
        in.close();
    }
}
