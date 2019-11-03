package ru.kulichenkom.ekkel.chapter15;

import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> cct1 = new ClassTypeCapture<>(Building.class);
        System.out.println(cct1.f(new Building()));
        System.out.println(cct1.f(new House()));
        ClassTypeCapture<House> cct2 = new ClassTypeCapture<>(House.class);
        System.out.println(cct2.f(new Building()));
        System.out.println(cct2.f(new House()));
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }
}
//Ch15Ex21 Измените пример ClassTypeCapture.java:
//добавьте в него контейнер Map<String,Class<?>>, метод addType(String typeName, Class<?> kind)
// и метод createNew(String typeName). Последний метод либо создает новый экземпляр класса,
// связанный с аргументом-строкой, либо выводит сообщение об ошибке.

class ClassTypeCaptureEx21<T> {
    Class<T> kind;
    Map<String, Class<?>> typeMap;

    public ClassTypeCaptureEx21(Class<T> kind) {
        this.kind = kind;
    }

    public ClassTypeCaptureEx21(Class<T> kind, Map<String, Class<?>> typeMap) {
        this.kind = kind;
        this.typeMap = typeMap;
    }

    public static void main(String[] args) {

        ClassTypeCaptureEx21<Building> cct1 = new ClassTypeCaptureEx21<>(Building.class);
        System.out.println(cct1.f(new Building()));
        System.out.println(cct1.f(new House()));
        ClassTypeCaptureEx21<House> cct2 = new ClassTypeCaptureEx21<>(House.class);
        System.out.println(cct2.f(new Building()));
        System.out.println(cct2.f(new House()));
        ClassTypeCaptureEx21<Building> captureEx21 = new ClassTypeCaptureEx21<>(Building.class, new HashMap<>());
        captureEx21.addType("House", House.class);
        captureEx21.addType("Building", Building.class);
        System.out.println("captureEx21.typeMap = " + captureEx21.typeMap);
        try {
            Building building = (Building) captureEx21.createNew("Building");
            House house = (House) captureEx21.createNew("House");
            System.out.print("building.getClass().getName(): ");
            System.out.println(building.getClass().getName());
            System.out.print("house.getClass().getName(): ");
            System.out.println(house.getClass().getName());
            System.out.print("House house is instance House: ");
            System.out.println(house instanceof House);
            System.out.print("House house is instance of Building: ");
            System.out.println(house instanceof Building);
            System.out.print("Building building is instance of House: ");
            System.out.println(building instanceof House);
            captureEx21.createNew("String");  // String class not available
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException in main");
        } catch (InstantiationException e) {
            System.out.println("InstantiationException in main");
        }
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typeName, Class<?> kind) {
        typeMap.put(typeName, kind);
    }

    public Object createNew(String typeName) throws IllegalAccessException, InstantiationException {
        if (typeMap.containsKey(typeName)) {
            return typeMap.get(typeName).newInstance();
        }
        System.out.println(typeName + " class not available");
        return null;
    }
}
