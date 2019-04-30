package ru.kulichenkom.ekkel.chapter6.access;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConnectionManagerTest {

    @Test
    void makeConnectionTest() {
        for (int i = 0; i < 10; i++) {
            Connection con = ConnectionManager.makeConnection();
            Assertions.assertTrue(con != null && con.toString().startsWith("This is connection"));
        }
        Connection connect = ConnectionManager.makeConnection();
        Assertions.assertNull(connect);
    }
}