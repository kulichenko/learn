//(Упражнение 3 главы 2)
// Find the code fragments involving ATypeName and turn them into a program that compiles and runs.
//то, что нашлось в учебнике:
//class ATypeName { /* Class body goes here */ }
//ATypeName a = new ATypeName();
package ru.kulichenkom.domain;

public class WheelTyres {
    private int width; //ширина шины
    private int profileHeight; //высота профиля шины
    private int rimDiameter; //диаметр обода

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
}
