package ru.kulichenkom.ekkel.access;

public class PartSecond {
    public static void main(String[] args) {
        Parts listOfParts = new Parts()
                .withFirstPart("Лонжерон")
                .withSecondPart("Решетка радиатора")
                .withThirdPart("Стартер")
                .withForthPart("Обшивка багажника");
        listOfParts.printFirstList();
        listOfParts.printSecondList();
        //listOfParts.printThirdList(); - has private access
        listOfParts.printForthList();
    }
}
