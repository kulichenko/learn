//Ch10Ex18 Создайте интерфейс, содержащий вложенный класс. Реализуйте
//интерфейс и создайте экземпляр вложенного класса.
package ru.kulichenkom.ekkel.chapter10;

public interface Button {
    void push();

    class Ok implements Button {
        public static void main(String[] args) {
            Button button = new Ok();
            button.push();
        }

        @Override
        public void push() {
            System.out.println("Button OK is pushed");
        }
    }
}
