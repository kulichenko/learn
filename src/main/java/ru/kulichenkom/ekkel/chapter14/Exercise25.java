//Ch14Ex25 Создайте класс, содержащий методы с разными уровнями доступа:
//private, protected, package. Напишите код, для вызова этих методов из-за предела пакетов.
package ru.kulichenkom.ekkel.chapter14;

import ru.kulichenkom.ekkel.chapter14.connectors.Jack;

import java.lang.reflect.Method;

public class Exercise25 {
    static void callHiddenMethod(Object object, String methodName) throws Exception {
        Method call = object.getClass().getDeclaredMethod(methodName);
        call.setAccessible(true);
        call.invoke(object);
    }

    public static void main(String[] args) throws Exception {
        Jack soket = new Jack();
        callHiddenMethod(soket, "connect");
        callHiddenMethod(soket, "disconnect");
        callHiddenMethod(soket, "repair");

    }
}