//(Упражнение 3 главы 2)
// Find the code fragments involving ATypeName and turn them into a program that compiles and runs.
//то, что нашлось в учебнике:
//class ATypeName { /* Class body goes here */ }
//ATypeName a = new ATypeName();
package ru.kulichenkom;

public class WheelTyres {
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getProfileHeight() {
        return profileHeight;
    }

    public void setProfileHeight(int profileHeight) {
        this.profileHeight = profileHeight;
    }

    public int getRimDiameter() {
        return rimDiameter;
    }

    public void setRimDiameter(int rimDiameter) {
        this.rimDiameter = rimDiameter;
    }

    int width; //ширина шины
    int profileHeight; //высота профиля шины
    int rimDiameter; //диаметр обода

    public static void main(String[] args) {

        WheelTyres wheelOne = new WheelTyres();
        wheelOne.setWidth(195);
        wheelOne.setProfileHeight(65);
        wheelOne.setRimDiameter(15);
        System.out.println(wheelOne.getWidth() + "/" + wheelOne.getProfileHeight() + "/" + wheelOne.getRimDiameter());
        //System.out.println(wheelOne.getProfileHeight());
         //System.out.println(wheelOne.getRimDiameter());
    }
}
