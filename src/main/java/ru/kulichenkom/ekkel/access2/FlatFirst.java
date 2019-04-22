package ru.kulichenkom.ekkel.access2;

import ru.kulichenkom.ekkel.access.Flat;

public class FlatFirst {
    public static void main(String[] args) {
        Flat firstFlat = new Flat()
                .withTypeOfObject("Квартира")
                .withFloor(5)
                .withRoomQty(3)
                .withBathroomQty(2);
        firstFlat.printFlatParameters();
    }
}
