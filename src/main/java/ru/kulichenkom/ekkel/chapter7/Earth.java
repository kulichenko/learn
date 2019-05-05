//Ch7Ex23 Продемонстрируйте, что загрузка класса выполняется только 1 раз.
//Докажите, что загрузка может быть вызвана как созданием первого экземпляра
//класаа, так и обращением к статическому члену.
package ru.kulichenkom.ekkel.chapter7;

class StarSystem {
    protected static int planetQty;
    protected static int starQty;
    private static String stars;

    public StarSystem(int planetQty, int starQty) {
        StarSystem.planetQty = planetQty;
        StarSystem.starQty = starQty;
        if (starQty == 1) {
            stars = " звезды";
        } else
            stars = " звезд";
        System.out.println("Данная звездная система состоит из " + planetQty + " планет и " + starQty + stars);
    }
}

class SolarSystem {
    private static String starName;

    public SolarSystem(String starName) {
        SolarSystem.starName = starName;
        System.out.println("В солнечной системе 1 звезда: " + starName);
    }
}

public class Earth extends StarSystem {
    private static String planetName = "Земля";

    public Earth() {
        super(planetQty, starQty);
        if (starQty == 1 && planetQty == 9) {
            System.out.println("Земля находится на третьей орбите от Солнца");
        } else
            System.out.println("Скорее всего это не солнечная система");
    }

    public static void main(String[] args) {
        new Earth();
        SolarSystem solarSystem = new SolarSystem("Солнце");
        StarSystem starSystem1 = new StarSystem(9, 1);
        new Earth();
        StarSystem starSystem2 = new StarSystem(9, 5);
        new Earth();
    }
}
