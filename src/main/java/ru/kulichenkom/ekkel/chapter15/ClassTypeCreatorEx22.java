//Ch15Ex22 Используя метку типа в сочетании с отражением, создайте метод, использующий версию newInstance()
//с аргументами  для создания объекта класса, конструктор которого получает аргументы.
package ru.kulichenkom.ekkel.chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Building {
}

class House extends Building {
    private String location;
    private Integer area;

    public House() {
        location = null;
    }

    public House(Integer area) {
        this.area = area;
    }

    public House(String location) {
        this.location = location;
    }

    public House(String location, Integer area) {
        this.location = location;
        this.area = area;
    }

    public String toString() {
        return "House" + ((location == null) ? "" : " in " + location) +
                ((area != null) ? (", " + area + " sq meters") : "");
    }
}

public class ClassTypeCreatorEx22<T> {
    Class<?> kind;

    public ClassTypeCreatorEx22(Class<T> kind) {
        this.kind = kind;
    }

    public static void main(String[] args) {
        ClassTypeCreatorEx22<Building> creatorBuilding = new ClassTypeCreatorEx22(Building.class);
        ClassTypeCreatorEx22<House> creatorHouse = new ClassTypeCreatorEx22(House.class);
        try {
            Building building = (Building) creatorBuilding.createObject("ru.kulichenkom.ekkel.chapter15.Building");
            System.out.println("House constructors: ");
            Constructor[] constructors = House.class.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
            House house = (House) creatorHouse.createObject("ru.kulichenkom.ekkel.chapter15.House", "Spb");
            House house1 = (House) creatorHouse.createObject("ru.kulichenkom.ekkel.chapter15.House", 1500);
            House house2 = (House) creatorHouse.createObject("ru.kulichenkom.ekkel.chapter15.House", "Russia", 1500);
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
