package ru.kulichenkom.ekkel.access2;

import ru.kulichenkom.ekkel.access.Flat;

public class FlatFirst {
    public static void main(String[] args) {
        Flat firstFlat = new Flat()
                .setTypeOfObject("Квартира")
                .setFloor(5)
                .setRoomQty(3)
                .setBathroomQty(2);
        firstFlat.printFlatParameters();
    }
}
