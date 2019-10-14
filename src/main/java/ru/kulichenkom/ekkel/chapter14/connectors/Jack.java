package ru.kulichenkom.ekkel.chapter14.connectors;

public class Jack {
    private void connect() {
        System.out.println("The jack is connected");
    }

    protected void disconnect() {
        System.out.println("The jack is disconnected");
    }

    void repair() {
        System.out.println("The jack is being repaired");
    }
}
