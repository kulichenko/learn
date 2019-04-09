//(Упражнение 3 главы 2)
// Find the code fragments involving ATypeName and turn them into a program that compiles and runs.
//то, что нашлось в учебнике:
//class ATypeName { /* Class body goes here */ }
//ATypeName a = new ATypeName();
package ru.kulichenkom.ekkel.chapter2;

import ru.kulichenkom.domain.WheelTyres;

public class WheelTyresMain {

    public static void main(String[] args) {
        WheelTyres wheelOne = new WheelTyres();
        wheelOne.setWidth(195);
        wheelOne.setProfileHeight(65);
        wheelOne.setRimDiameter(15);
        System.out.println(wheelOne.getWidth() + "/" + wheelOne.getProfileHeight() + "/" + wheelOne.getRimDiameter());
    }
}
