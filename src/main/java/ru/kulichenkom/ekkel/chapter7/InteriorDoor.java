//Ch7Ex8 Создайте базовый класс с единственным конструктором (не по умолчанию), и производный класс
//как с конструктором по умолчанию, так и с аргументами. В конструкторе производного класса вызовите конструктор
// базового класса.

package ru.kulichenkom.ekkel.chapter7;

class Doors {
    int height, width, thickness;
    String typeOfDoor;

    public Doors(int height, int width, int thickness, String typeOfDoor) {
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.typeOfDoor = typeOfDoor;
        System.out.println(height + "/" + width + "/" + thickness + " " + typeOfDoor);
    }
}

public class InteriorDoor extends Doors {
    private boolean withHandle;

    public InteriorDoor() {
        super(2000, 600, 60, "Bathroom Door");
    }

    public InteriorDoor(int height, int width, int thickness, String typeOfDoor, boolean withHandle) {
        super(height, width, thickness, typeOfDoor);
        this.withHandle = withHandle;
    }

    public static void main(String[] args) {
        InteriorDoor bathDoor = new InteriorDoor();
        InteriorDoor door = new InteriorDoor(2000, 900, 60, "Door without glass. Handle on the door: ", true);
    }
}
