package com.example.duanbanhang2;

import java.sql.SQLException;

public class HelloApplication {
    public static void main(String[] args) throws SQLException {
        HelloController helloController = new HelloController();
        helloController.connection();

    }
}