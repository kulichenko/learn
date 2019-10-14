package ru.kulichenkom.ekkel.chapter14.pets;
//: typeinfo/pets/ForNameCreator.java

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "ru.kulichenkom.ekkel.chapter14.pets.Mutt",
            "ru.kulichenkom.ekkel.chapter14.pets.Pug",
            "ru.kulichenkom.ekkel.chapter14.pets.EgyptianMau",
            "ru.kulichenkom.ekkel.chapter14.pets.Manx",
            "ru.kulichenkom.ekkel.chapter14.pets.Cymric",
            "ru.kulichenkom.ekkel.chapter14.pets.Rat",
            "ru.kulichenkom.ekkel.chapter14.pets.Mouse",
            "ru.kulichenkom.ekkel.chapter14.pets.Hamster",
            "ru.kulichenkom.ekkel.chapter14.pets.Gerbil"
    };

    static {
        loader();
    }

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~