//Ch6Ex1 Определите класс в пакете. Создайте экземпляр класса
//за пределами пакета. Экземпляр создан  в пакете access2

package ru.kulichenkom.ekkel.chapter6.access;

public class Flat {
    private int roomQty, floor, bathroomQty;
    private String typeOfObject;

    public void printFlatParameters() {
        System.out.println(typeOfObject + " " + "\n Этаж " + floor + "\n Количество комнат " +
                roomQty + "\n Коичество санузлов " + bathroomQty);
    }

    public String getTypeOfObject() {
        return typeOfObject;
    }

    public Flat withTypeOfObject(String typeOfObject) {
        this.typeOfObject = typeOfObject;
        return this;
    }

    public int getRoomQty() {
        return roomQty;
    }

    public Flat withRoomQty(int roomQty) {
        this.roomQty = roomQty;
        return this;
    }

    public int getFloor() {
        return floor;
    }

    public Flat withFloor(int floor) {
        this.floor = floor;
        return this;
    }

    public int getBathroomQty() {
        return bathroomQty;
    }

    public Flat withBathroomQty(int bathroomQty) {
        this.bathroomQty = bathroomQty;
        return this;
    }
}
