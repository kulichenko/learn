package ru.kulichenkom.ekkel.access2;

import ru.kulichenkom.ekkel.access.Parts;

public class PartSecond {
    public static void main(String[] args) {
        Parts listOfPartsTwo = new Parts()
                .withFirstPart("Руль")
                .withSecondPart("Педаль")
                .withThirdPart("Пружина")
                .withForthPart("Стойка");
        //  listOfPartsTwo.printFirstList(); // - is not public
        listOfPartsTwo.printSecondList();
        //  listOfPartsTwo.printThirdList(); //- has private access
        //  listOfPartsTwo.printForthList(); // - has protected access
    }
}
