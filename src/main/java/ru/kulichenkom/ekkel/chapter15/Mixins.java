//Ch15Ex37 Добавьте в Mixins.java новый класс примеси Colored. Подмешайте его в Mixin
// и покажите, что программа работает.
package ru.kulichenkom.ekkel.chapter15;
//github.com/BruceEckel/TIJ4-code/blob/master/examples/generics/Mixins.java
//: generics/Mixins.java

import java.util.Date;

interface Color {
    String getColor();

    void setColor(String color);
}

class Colored implements Color {
    private String color;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

interface TimeStamped {
    long getStamp();
}

interface SerialNumbered {
    long getSerialNumber();
}

interface Basic {
    void set(String val);

    String get();
}

class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return timeStamp;
    }
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public long getSerialNumber() {
        return serialNumber;
    }
}

class BasicImp implements Basic {
    private String value;

    public void set(String val) {
        value = val;
    }

    public String get() {
        return value;
    }
}

//class Mixin фактически использует деленирование, так что каждый примесный тип требует поля в Mixin.
//и выдолжны написать все необходимые методы в Mixin для передачи вызовов соответствующим объектам .
//При более сложных примесях код быстро разрастается.
class Mixin extends BasicImp implements TimeStamped, SerialNumbered, Color {
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber = new SerialNumberedImp();
    private Color color = new Colored();

    public long getStamp() {
        return timeStamp.getStamp();
    }

    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }

    @Override
    public String getColor() {
        return color.getColor();
    }

    @Override
    public void setColor(String val) {
        color.setColor(val);
    }
}

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(),
                mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin1.setColor("Green");
        mixin2.set("test string 2");
        mixin2.setColor("Yellow");
        System.out.println(mixin1.get() + " " +
                mixin1.getStamp() + " " + mixin1.getSerialNumber() + " " + mixin1.getColor());
        System.out.println(mixin2.get() + " " +
                mixin2.getStamp() + " " + mixin2.getSerialNumber() + " " + mixin2.getColor());
    }
}