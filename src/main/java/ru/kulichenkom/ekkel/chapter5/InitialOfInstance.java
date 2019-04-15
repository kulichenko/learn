//Ch5Ex15 программа не сработала Exception in thread "main" java.lang.StackOverflowError
//at ru.kulichenkom.ekkel.chapter5.InitialOfInstance.<init>(InitialOfInstance.java:14)
// Саздайте класс, производный от String, инициализируемый в секции
//инициализации экземпляра
package ru.kulichenkom.ekkel.chapter5;

public class InitialOfInstance {
    InitialOfInstance firstFurniture;
    InitialOfInstance secondFurniture;

    {
        firstFurniture = new InitialOfInstance("Sofa");
        secondFurniture = new InitialOfInstance("Chair");
    }

    public InitialOfInstance(String furniture) {
        System.out.println(furniture);
    }                                       //секция инициализации экземпляра

    public static void main(String[] args) {
        new InitialOfInstance("Bed");
    }
}
