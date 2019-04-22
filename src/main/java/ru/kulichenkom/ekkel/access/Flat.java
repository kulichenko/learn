//Ch6Ex1 Определите класс в пакете. Создайте экземпляр класса
//за пределами пакета. Экземпляр создан  в пакете access2

package ru.kulichenkom.ekkel.access;

public class Flat {
    private int roomQty, floor, bathroomQty;
    private String typeOfObject;

    public void flatParameters() {
        System.out.println(getTypeOfObject() + " " + "\n Этаж " + getFloor() + "\n Количество комнат " +
                getRoomQty() + "\n Коичество санузлов " + getBathroomQty());
    }

    public String getTypeOfObject() {
        return typeOfObject;
    }

    public void setTypeOfObject(String typeOfObject) {
        this.typeOfObject = typeOfObject;
    }


    public int getRoomQty() {
        return roomQty;
    }

    public void setRoomQty(int roomQty) {
        this.roomQty = roomQty;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getBathroomQty() {
        return bathroomQty;
    }

    public void setBathroomQty(int bathroomQty) {
        this.bathroomQty = bathroomQty;
    }
}
