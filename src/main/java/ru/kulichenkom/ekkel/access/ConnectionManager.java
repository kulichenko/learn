//Ch6Ex8 (4) По образцу примера Lunch.java создайте класс с именем ConnectionManager,
// который управляет фиксированным массивом объектов Connection. Программист-клиент не
//должен создавать объекты Connection напрямую, а может получить их только с помощью
//статического метода класса ConnectionManager. Когда запас объектов у класса ConnectionManager
// закончится, он должен вернуть ссылку null. Протестируйте классы в методе main().
//
package ru.kulichenkom.ekkel.access;

class Connection {
    Connection() {
    }
}

public class ConnectionManager {
    private static Connection[] connect = new Connection[10];

    private ConnectionManager() {
    }

    private static Connection makeConnection() {
        for (int i = 0; i != connect.length; ++i) {
            if (connect[i] == null) {
                connect[i] = new Connection();
                System.out.println(connect[i]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ConnectionManager.makeConnection();
    }
}
