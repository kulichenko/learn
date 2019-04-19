//Ch5Ex2 Создайте класс с полем String инициализируемым в точке определения
// и другим полем, инициализируемым конструктором. Чем отличаются эти 2 подхода?
package ru.kulichenkom.ekkel.chapter5;

public class StringField {
    String predefinedFielf = "Предопределенное поле";
    String constructoredField;

    public StringField(String constructoredField) {
        this.constructoredField = constructoredField;
    }

    public static void main(String[] args) {
        StringField testField = new StringField("Это поле сделано с помощью конструктора");
        System.out.println(testField.getPredefinedFielf());
        System.out.println(testField.getConstructoredField());
    }

    public String getPredefinedFielf() {
        return predefinedFielf;
    }

    public String getConstructoredField() {
        return constructoredField;
    }
}
