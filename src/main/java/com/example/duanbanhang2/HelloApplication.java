package com.example.duanbanhang2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
     primaryStage.setTitle("login");
     primaryStage.setScene(new Scene(root));
     primaryStage.setMaximized(true);
     primaryStage.show();
    }

    public static void main(String[] args) throws SQLException {

        launch(args);

    }
}