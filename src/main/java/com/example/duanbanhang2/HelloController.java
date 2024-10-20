package com.example.duanbanhang2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;

public class HelloController {


    //    chức năng kết nối database
    private final String URL = "jdbc:mysql://localhost:3306/duanbanhang";
    private final String USERNAME = "root";
    private final String PASSWORD = "882005";

    public Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return conn;
    }


    @FXML
    private TextField username1;
    @FXML
    private PasswordField password1;

    @FXML
    public void login() throws SQLException {
        String usernamed = username1.getText();
        String passworded = password1.getText();

        Connection conn = connection();
        String query = "select role from user where username = ? and password = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, usernamed);
        preparedStatement.setString(2, passworded);
        ResultSet rt = preparedStatement.executeQuery();
        if (rt.next()) {
            String role = rt.getString("role");
            System.out.println(role);
        }


    }

}

