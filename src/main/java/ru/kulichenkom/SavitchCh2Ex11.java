package ru.kulichenkom;
import javax.swing.*;
public class SavitchCh2Ex11 {
    public static void main(String[] args) {
        String appleString;
        appleString = JOptionPane.showInputDialog("Введите количество яблок");
        int appleCount;
        appleCount = Integer.parseInt(appleString);
        String clamsPerApple;
        clamsPerApple = JOptionPane.showInputDialog("Введите стоимость 1 яблока");
        int clamsPerAppleCount = Integer.parseInt(clamsPerApple);
        int totalNumbersOfClams;
        totalNumbersOfClams = appleCount * clamsPerAppleCount;
        JOptionPane.showMessageDialog(null, "Стоимость всех яблок " + totalNumbersOfClams);
        System.exit(0);
    }
}
