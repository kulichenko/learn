package ru.kulichenkom.ekkel.chapter14.pets;

//: typeinfo/PetCount4.java

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            System.out.printf((pet.getClass().getSimpleName() + " "));
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}