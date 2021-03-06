//Ch9Ex5 Создайте интерфейс, содержащий три метода, в отдельном пакете.
// Реализуйте этот интерфейс в другом пакете.
package ru.kulichenkom.ekkel.chapter9.budget.suppliers;

import ru.kulichenkom.ekkel.chapter9.budget.Budget;

public class Supplier implements Budget {
    public static void main(String[] args) {
        Budget htm = new Supplier();
        purchaseInformation(htm);
    }

    @Override
    public void purchasingRequest() {
        System.out.println("Выпущен запрос на поставку");
    }

    @Override
    public void order() {
        System.out.println("Выпущен заказ на поставку товаров");
    }

    @Override
    public void goodsReceipt() {
        System.out.println("Произведена приемка товаров");
    }

    @Override
    public void payment() {
        System.out.println("Произведена оплата товара");
    }

    public static void purchaseInformation(Budget budget) {
        budget.purchasingRequest();
        budget.order();
        budget.goodsReceipt();
        budget.payment();
    }
}
