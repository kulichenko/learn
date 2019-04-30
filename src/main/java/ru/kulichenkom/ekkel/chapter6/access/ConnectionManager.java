//Ch6Ex8 (4) По образцу примера Lunch.java создайте класс с именем ConnectionManager,
// который управляет фиксированным массивом объектов Connection. Программист-клиент не
//должен создавать объекты Connection напрямую, а может получить их только с помощью
//статического метода класса ConnectionManager. Когда запас объектов у класса ConnectionManager
// закончится, он должен вернуть ссылку null. Протестируйте классы в методе main().
//
package ru.kulichenkom.ekkel.chapter6.access;

class Connection {
    private int conNumber;

    public Connection(int conNumber) {
        this.conNumber = conNumber;
    }

    @Override
    public String toString() {
        return "This is connection #" + conNumber;
    }
}

public class ConnectionManager {
    private static int thisConnect = 0;
    private static Connection[] connect = new Connection[10];

    static {
        for (int i = 0; i < connect.length; i++) {
            connect[i] = new Connection(i);
        }
    }

    private ConnectionManager() {
    }

    public static Connection makeConnection() {
        if (thisConnect < connect.length) {
            Connection con = connect[thisConnect];
            thisConnect++;
            return con;
        } else
            return null;
    }
}

