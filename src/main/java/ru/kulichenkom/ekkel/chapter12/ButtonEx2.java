//Ch12Ex2 Определите ссылку на объект и присвойте ей значение null. Попробуйте вызвать метод
//объекта, пользуясь этой ссылкой. Потом вставьте этот код в блок try-catch и перехватите исключение
package ru.kulichenkom.ekkel.chapter12;

public class ButtonEx2 {
    public static void main(String[] args) {
        ButtonEx2 loginButton = new ButtonEx2();
        loginButton = null;
        try {
            loginButton.push();
        } catch (NullPointerException e) {
            System.out.println("loginButton is null");
        }
    }

    public void push() {
        System.out.println("Нажать кнопку");
    }
}