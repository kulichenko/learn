//(1) Find the code fragments involving ATypeName and turn them into a
//program that compiles and runs.
//то, что нашлось в учебнике:
//class ATypeName { /* Class body goes here */ }
//ATypeName a = new ATypeName();
package ru.kulichenkom;

public class EkCh2Ex3 {
    public static void main(String[] args) {
        class WheelTyres {
            int width; //ширина шины
            int profileHeight; //высота профиля шины
            int rimDiameter; //диаметр обода
        }
        WheelTyres wheelOne = new WheelTyres();
        wheelOne.width = 195;
        wheelOne.profileHeight = 65;
        wheelOne.rimDiameter = 15;
    }
}
