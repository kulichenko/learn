package ru.kulichenkom.ekkel.chapter6.access;

public class CreateConnection {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Connection con = ConnectionManager.makeConnection();
            System.out.println(con);
        }
    }
}
