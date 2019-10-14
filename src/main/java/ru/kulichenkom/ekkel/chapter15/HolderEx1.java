//Ch15Ex1 используйте Holder3 с библиотекой typeinfo.pets и продемоенстрируйте, что
//объект Holder3, объявленный с базовым типом, также может хранить производный тип.

package ru.kulichenkom.ekkel.chapter15;

import ru.kulichenkom.ekkel.chapter14.pets.Cat;
import ru.kulichenkom.ekkel.chapter14.pets.Dog;
import ru.kulichenkom.ekkel.chapter14.pets.Pet;

public class HolderEx1<T> {
    private T a;

    public HolderEx1(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        HolderEx1<Pet> pet = new HolderEx1<>(new Pet());
        Pet a = pet.getA();
        System.out.println(pet.getA());
        pet.setA(new Cat());
        System.out.println(pet.getA());
        pet.setA(new Dog());
        System.out.println(pet.getA());
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}