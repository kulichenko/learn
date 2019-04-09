package ru.kulichenkom.sawitch;

import java.util.Scanner;

public class SavitchCh2Ex7 {
    public static void main(String[] args) {

        System.out.println("Enter name of your friend:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Enter favorite colour:");
        String colour = in.nextLine();
        System.out.println("Enter favorite dish:");
        String dish = in.nextLine();
        System.out.println("Enter favorite animal:");
        String animal = in.nextLine();
        in.close();
        System.out.println("I had a dream that " + name + " ate a " + colour + " " + animal + " and said it was as delicious as " + dish);

    }
}
