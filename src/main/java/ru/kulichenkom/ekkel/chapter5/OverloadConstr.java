//Ch5Ex4 Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий
//в качестве параметра строку String и распечатывающий ее вместе с сообщением
package ru.kulichenkom.ekkel.chapter5;

public class OverloadConstr {
    String message;

    public OverloadConstr() {
    }

    public OverloadConstr(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        OverloadConstr sayIt = new OverloadConstr();
        sayIt.message = "Это конструктор по умолчанию";
        System.out.println(sayIt.getMessage());
        OverloadConstr overloadConstr = new OverloadConstr("Это пример перегруженного конструктора");
        System.out.println(overloadConstr.getMessage());
    }
}
