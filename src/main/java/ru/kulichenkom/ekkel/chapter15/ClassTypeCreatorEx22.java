//Ch15Ex22 Используя метку типа в сочетании с отражением, создайте метод, использующий версию newInstance()
//с аргументами  для создания объекта класса, конструктор которого получает аргументы.
package ru.kulichenkom.ekkel.chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Buildings {
}

class Houses extends Buildings {
    private String location;
    private Integer area;

    public Houses() {
        location = null;
    }

    public Houses(Integer area) {
        this.area = area;
    }

    public Houses(String location) {
        this.location = location;
    }

    public Houses(String location, Integer area) {
        this.location = location;
        this.area = area;
    }

    public String toString() {
        return "Houses" + ((location == null) ? "" : " in " + location) +
                ((area != null) ? (", " + area + " sq meters") : "");
    }
}

public class ClassTypeCreatorEx22<T> {
    Class<?> kind;

    public ClassTypeCreatorEx22(Class<T> kind) {
        this.kind = kind;
    }

    public static void main(String[] args) {
        ClassTypeCreatorEx22<Buildings> creatorBuildings = new ClassTypeCreatorEx22(Buildings.class);
        ClassTypeCreatorEx22<Houses> creatorHouses = new ClassTypeCreatorEx22(Houses.class);
        try {
            Buildings building = (Buildings) creatorBuildings.createObject("ru.kulichenkom.ekkel.chapter15.Buildings");
            System.out.println("Houses constructors: ");
            Constructor[] constructors = Houses.class.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
            Houses house = (Houses) creatorHouses.createObject("ru.kulichenkom.ekkel.chapter15.Houses", "Spb");
            Houses house1 = (Houses) creatorHouses.createObject("ru.kulichenkom.ekkel.chapter15.Houses", 1500);
            Houses house2 = (Houses) creatorHouses.createObject("ru.kulichenkom.ekkel.chapter15.Houses", "Russia", 1500);
            System.out.println(house);
            System.out.println(house1);
            System.out.println(house2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public Object createObject(String typeName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return Class.forName(typeName).newInstance();
    }

    public Object createObject(String typeName, Object... args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        switch (args.length) {
            case 1:
                return Class.forName(typeName).getConstructor(args[0].getClass()).newInstance(args[0]);
            case 2:
                return Class.forName(typeName).getConstructor(args[0].getClass(), args[1].getClass()).newInstance(args[0], args[1]);
        }
        return null;
    }
}