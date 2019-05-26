//Ch9Ex5 Создайте интерфейс, содержащий три метода, в отдельном пакете.
// Реализуйте этот интерфейс в другом пакете.
package ru.kulichenkom.ekkel.chapter9.budget;

public interface Budget {
    void payment();

    void purchasingRequest();

    void goodsReceipt();

    void order();
}
