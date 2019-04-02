//Упражнение 4 и 5 второй главы:
//Exercise 4: (1) Turn the DataOnly code fragments into a program that compiles and runs.
//Exercise 5: (1) Modify the previous exercise so that the values of the data in DataOnly
//are assigned to and printed in main( ).
//Найден в главе следующий код:
// class DataOnly {
// int i;
// double d;
// boolean b;}
//DataOnly data = new DataOnly();
package ru.kulichenkom;

public class DataOnlyCh2Ex4 {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    private int i;
    private double d;
    private boolean b;

    public static void main(String[] args) {
        DataOnlyCh2Ex4 data = new DataOnlyCh2Ex4();
        data.i = 47;
        data.b = true;
        data.d = 1.1;
        System.out.println(data.getI());
        System.out.println(data.isB());
        System.out.println(data.getD());
    }
}
