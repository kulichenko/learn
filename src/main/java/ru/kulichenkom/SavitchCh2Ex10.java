package ru.kulichenkom;

import javax.swing.*;

public class SavitchCh2Ex10 {
    public static void main(String[] args) {
        String appleString;
        appleString = JOptionPane.showInputDialog("Введите количество яблок");
        int appleCount;
        appleCount = Integer.parseInt(appleString);
        String orangeString;
        orangeString = JOptionPane.showInputDialog("Введите количество апельсинов");
        int orangeCount = Integer.parseInt(orangeString);
        int totalFruitCount;
        totalFruitCount = appleCount + orangeCount;
        JOptionPane.showMessageDialog(null, "Количество яблок " + appleCount);
        JOptionPane.showMessageDialog(null, "Количество апельсинов " + orangeCount);
        JOptionPane.showMessageDialog(null, "Общее количество фруктов " + totalFruitCount);
        System.exit(0);
    }
}
