module com.example.duanbanhang2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.duanbanhang2 to javafx.fxml;
    exports com.example.duanbanhang2;
}