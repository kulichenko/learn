//Ch9Ex8 В программе Sandwich из главы 8 создайте интерфейс с именем
//FastFood. Измените класс Sandwich так, чтобы он реализовал этот интерфейс
//class Meal {
//  Meal() { print("Meal()"); }
//}
//
//class Bread {
//  Bread() { print("Bread()"); }
//}
//
//class Cheese {
//  Cheese() { print("Cheese()"); }
//}
//
//class Lettuce {
//  Lettuce() { print("Lettuce()"); }
//}
//
//class Lunch extends Meal {
//  Lunch() { print("Lunch()"); }
//}
//
//class PortableLunch extends Lunch {
//  PortableLunch() { print("PortableLunch()");}
//}
//
//public class Sandwich extends PortableLunch {
//  private Bread b = new Bread();
//  private Cheese c = new Cheese();
//  private Lettuce l = new Lettuce();
//  public Sandwich() { print("Sandwich()"); }
//  public static void main(String[] args) {
//    new Sandwich();
//  }
//}

package ru.kulichenkom.ekkel.chapter9;

interface FastFood {
    void cheeseburger();

    void iceCream();

    void cola();

    default void showFastFoodInfo(FastFood fastFood) {
        fastFood.cheeseburger();
        fastFood.iceCream();
        fastFood.cola();
    }
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        FastFood sandwich = new Sandwich();
        sandwich.showFastFoodInfo(sandwich);
    }

    @Override
    public void cheeseburger() {
        System.out.println("Cheeseburger");
    }

    @Override
    public void iceCream() {
        System.out.println("Ice cream");
    }

    @Override
    public void cola() {
        System.out.println("Cola");
    }

    public Bread getB() {
        return b;
    }
}