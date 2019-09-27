//Ch14Ex14 Конструктор является разновидностью фабричного метода. Измените пример
//RegisteredFactories.java так, чтобы вместо использования явно заданной фабрики
//объект класса сохранялся в LIst а для его создания использовался метод newInstance().
//
//Пример из книги стр477 RegisteredFactories.java для выполнения упражнения 14.
package ru.kulichenkom.ekkel.chapter14;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
    static List<Class<? extends Part>> partFactories = new ArrayList<>();
    private static Random rand = new Random(47);

    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }

    public static Part createRandom() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).getDeclaredConstructor().newInstance();
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    // Create a Class Factory for each specific type:
    public static class Factory implements ru.kulichenkom.ekkel.chapter14.factory.Factory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements ru.kulichenkom.ekkel.chapter14.factory.Factory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements ru.kulichenkom.ekkel.chapter14.factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements ru.kulichenkom.ekkel.chapter14.factory.Factory<OilFilter> {
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory
            implements ru.kulichenkom.ekkel.chapter14.factory.Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements ru.kulichenkom.ekkel.chapter14.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements ru.kulichenkom.ekkel.chapter14.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        for (int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());
    }
}