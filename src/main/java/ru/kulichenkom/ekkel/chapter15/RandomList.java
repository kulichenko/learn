//Ch15Ex6 Используйте RandomList еще с двумя типами, кроме представленного в main().
package ru.kulichenkom.ekkel.chapter15;
//: generics/RandomList.java

import ru.kulichenkom.ekkel.chapter14.pets.LiteralPetCreator;
import ru.kulichenkom.ekkel.chapter14.pets.Pet;
import ru.kulichenkom.ekkel.chapter14.pets.PetCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
    public static final PetCreator creator = new LiteralPetCreator();
    private List<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static void main(String[] args) {
        RandomList<String> stringRandomLists = new RandomList<>();
        for (String s : ("The quick brown fox jumped over the lazy brown dog").split(" ")) {
            stringRandomLists.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(stringRandomLists.select() + " ");
        }
        System.out.println();
        RandomList<Integer> integerRandomList = new RandomList<>();
        RandomList<Pet> petRandomList = new RandomList<>();
        for (int i = 0; i < 10; i++) {
            integerRandomList.add(i);
            petRandomList.add(creator.randomPet());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(integerRandomList.select() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(petRandomList.select() + " ");
        }
    }

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
}