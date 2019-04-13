//Ch5Ex1 Создайте класс с неинициализированной ссылкой на String. Покажите
//что Java инициализирует ссылку значением null
package ru.kulichenkom.ekkel;

public class StringNull {
    String field;

    public StringNull(String s) {
        this.field = s;
    }

    public static void main(String[] args) {
        StringNull snull = new StringNull("какая-то строка");
        System.out.println(snull.getField());

    }

    public String getField() {
        return field;
    }
}
