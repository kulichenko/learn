//Ch5Ex15 Саздайте класс, производный от String, инициализируемый в секции
//инициализации экземпляра
package ru.kulichenkom.ekkel.chapter5;

class Instance {
    Instance(String furniture) {
        System.out.println("Furniture: " + furniture);
    }
}

public class InitialOfInstance {
    private Instance firstFurniture;
    private Instance secondFurniture;

    {
        firstFurniture = new Instance("Sofa");   //секция инициализации экземпляра
        secondFurniture = new Instance("Chair");
    }

    public static void main(String[] args) {
        new InitialOfInstance();
    }
}
