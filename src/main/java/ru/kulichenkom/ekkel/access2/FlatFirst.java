package ru.kulichenkom.ekkel.access2;

import ru.kulichenkom.ekkel.access.Flat;

public class FlatFirst {
    public static void main(String[] args) {
        Flat firstFlat = new Flat();
        firstFlat.setTypeOfObject("Квартира");
        firstFlat.setFloor(5);
        firstFlat.setRoomQty(3);
        firstFlat.setBathroomQty(2);
        firstFlat.flatParameters();
    }
}
