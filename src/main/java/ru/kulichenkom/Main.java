package ru.kulichenkom;

import ru.kulichenkom.domain.WheelTyres;
import ru.kulichenkom.ekkel.chapter2.DataOnlyCh2Ex4;
import ru.kulichenkom.ekkel.chapter2.EkkelCh2Ex1;

public class Main {

    public static void main(String[] arg) {
        EkkelCh2Ex1 testObject = new EkkelCh2Ex1();
        DataOnlyCh2Ex4 data = new DataOnlyCh2Ex4();
        System.out.println("integer is :" + testObject.getI());
        System.out.println("Char is: " + testObject.getCh());
        System.out.println(data.getI());
        System.out.println(data.isB());
        System.out.println(data.getD());
        WheelTyres wheelOne = new WheelTyres();
        wheelOne.setWidth(195);
        wheelOne.setProfileHeight(65);
        wheelOne.setRimDiameter(15);
        System.out.println(wheelOne.getWidth());
        System.out.println(wheelOne.getProfileHeight());
        System.out.println(wheelOne.getRimDiameter());
    }

}
