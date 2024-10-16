package com.example.duanbanhang2;


import javafx.fxml.FXML;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloController {
 private final String URL = "jdbc:mysql://localhost:3306/duanbanhang";
 private final String USERNAME = "root";
 private final String PASSWORD = "tamtamtam";

 public Connection connection() throws SQLException {
     Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
     System.out.println("Da ket noi thanh cong");
     return conn;
 }


 @FXML
 private javafx.scene.control.TextField username;
 @FXML
 private TextField password;
 @FXML
    public void login() {
     String usernamed = username.getText();
     String passworded = password.getText();
 }
 }