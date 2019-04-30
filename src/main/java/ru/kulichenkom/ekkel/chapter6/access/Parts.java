//Ch6Ex5 Создайте класс с полями и методами, обладающими разными уровнями доступа public, private,
//protected, в пределах пакета. Создайте объект этого класса и посмотрите какие сообщения выдает компилятор
//при поптыке обращения к разным членам класса. (Дополнительные классы access/PartSecond, access2/PartSecond)
package ru.kulichenkom.ekkel.chapter6.access;

public class Parts {
    public String secondPart;
    protected String forthPart;
    String firstPart;
    private String thirdPart;

    public static void main(String[] args) {
        Parts listOfParts = new Parts()
                .withFirstPart("Деталь 1")
                .withSecondPart("Деталь 2")
                .withThirdPart("Деталь 3")
                .withForthPart("Деталь 4");
        listOfParts.printFirstList();
        listOfParts.printSecondList();
        listOfParts.printThirdList();
        listOfParts.printForthList();
    }

    public Parts withFirstPart(String firstPart) {
        this.firstPart = firstPart;
        return this;
    }

    public Parts withSecondPart(String secondPart) {
        this.secondPart = secondPart;
        return this;
    }

    public Parts withThirdPart(String thirdPart) {
        this.thirdPart = thirdPart;
        return this;
    }

    public Parts withForthPart(String forthPart) {
        this.forthPart = forthPart;
        return this;
    }

    void printFirstList() {
        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println(thirdPart);
        System.out.println(forthPart);
    }

    public void printSecondList() {
        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println(thirdPart);
        System.out.println(forthPart);
    }

    private void printThirdList() {
        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println(thirdPart);
        System.out.println(forthPart);
    }

    protected void printForthList() {
        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println(thirdPart);
        System.out.println(forthPart);
    }
}

