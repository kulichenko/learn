package ru.kulichenkom.ekkel.chapter11;

import java.util.Map;
import java.util.TreeMap;

public class Calculator {

    private static Map<String, Double> storage = new TreeMap<>();
    private int counterPlus;
    private int counterMinus;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.plus(12.0, 5.0);
        calculator.plus(11.0, 2.0);
        calculator.minus(17.0, 12.0);
        calculator.minus(16.0, 12.0);
        calculator.minus(19.0, 12.0);
        calculator.minus(11.0, 12.0);
        calculator.getPlusCalculation(2);
        calculator.getMinusCalculation(3);
        calculator.getMinusCalculation(10);
        System.out.println(storage);
    }

    public void plus(Double a, Double b) {
        counterPlus++;
        String keyPlus = "Сложение " + counterPlus;
        Double c = a + b;
        storage.put(keyPlus, c);
        System.out.println(a + " + " + b + " = " + c);
    }

    public void minus(Double a, Double b) {
        counterMinus++;
        String keyMinus = "Вычитание " + counterMinus;
        Double c = a - b;
        storage.put(keyMinus, c);
        System.out.println(a + " - " + b + " = " + c);
    }

    public void getPlusCalculation(int calculationNumber) {
        System.out.println("Сложение " + calculationNumber + " = " + storage.get("Сложение " + calculationNumber));
    }

    public void getMinusCalculation(int calculationNumber) {
        System.out.println("Вычитание " + calculationNumber + " = " + storage.get("Вычитание " + calculationNumber));
    }
}
