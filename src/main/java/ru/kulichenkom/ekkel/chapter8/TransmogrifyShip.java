/*Ch8Ex17 По образцу Transmogrify.java создайте класс Starship со ссылкой на
объект AlertStatus, который может обозначать одно из трех состояний. Включите методы для изменения состояния.*/
//class Actor {
//public void act() {}
//}
//class HappyActor extends Actor {
//public void act() { print("HappyActor"); }
//}
//class SadActor extends Actor {
//public void act() { print("SadActor"); }
//}
//class Stage {
//private Actor actor = new HappyActor();
//public void change() { actor = new SadActor(); }
//public void performPlay() { actor.act(); }
//}
//public class Transmogrify {
//public static void main(String[] args) {
//Stage stage = new Stage();
//stage.performPlay();
//stage.change();
//stage.performPlay();
//}
//}
package ru.kulichenkom.ekkel.chapter8;

class AlertStatus {
    public void alert() {
    }
}

class NormalAlert extends AlertStatus {
    public void alert() {
        System.out.println("AlertStatus Normal");
    }
}

class HighAlert extends AlertStatus {
    public void alert() {
        System.out.println("AlertStatus High");
    }
}

class MaximumAlert extends AlertStatus {
    public void alert() {
        System.out.println("AlertStatus Maximum");
    }
}

class Starship {
    private AlertStatus alertStatus = new NormalAlert();

    public void normalAlert() {
        alertStatus = new NormalAlert();
    }

    public void highAlert() {
        alertStatus = new HighAlert();
    }

    public void maximumAlert() {
        alertStatus = new MaximumAlert();
    }

    public void checkAlertStatus() {
        alertStatus.alert();
    }
}

public class TransmogrifyShip {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.checkAlertStatus();
        starship.highAlert();
        starship.checkAlertStatus();
        starship.maximumAlert();
        starship.checkAlertStatus();
        starship.normalAlert();
        starship.checkAlertStatus();
    }
}
