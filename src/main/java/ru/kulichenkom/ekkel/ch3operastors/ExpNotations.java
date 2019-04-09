//Ch3Ex9 выведите наибольшее и наименьшее число в экспон записи для типов float и double
package ru.kulichenkom.ekkel.ch3operastors;

public class ExpNotations {

    float maxFloat, minFloat;
    double maxDouble, minDouble;

    public float getMaxFloat() {
        return maxFloat;
    }

    public void setMaxFloat(float maxFloat) {
        this.maxFloat = maxFloat;
    }

    public float getMinFloat() {
        return minFloat;
    }

    public void setMinFloat(float minFloat) {
        this.minFloat = minFloat;
    }

    public double getMaxDouble() {
        return maxDouble;
    }

    public void setMaxDouble(double maxDouble) {
        this.maxDouble = maxDouble;
    }

    public double getMinDouble() {
        return minDouble;
    }

    public void setMinDouble(double minDouble) {
        this.minDouble = minDouble;
    }

    public static void main(String[] args) {
        ExpNotations notations = new ExpNotations();
        notations.setMinDouble(-4.9e-324);
        notations.setMaxDouble(1.7e+308);
        notations.setMinFloat(-1.4e-45f);
        notations.setMaxFloat(3.4e+38f);
        System.out.println("Min Double Value: " + notations.getMinDouble() +
                "\n Max Double Value: " + notations.getMaxDouble() +
                "\n Min float value: " + notations.getMinFloat() +
                "\n Max float value: " + notations.getMaxFloat());
    }
}
