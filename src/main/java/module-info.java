module com.example.duanbanhang2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.duanbanhang2 to javafx.fxml;
    exports com.example.duanbanhang2;
}