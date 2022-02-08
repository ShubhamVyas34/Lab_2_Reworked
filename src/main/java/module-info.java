module com.example.labs_2_geo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labs_2_geo to javafx.fxml;
    exports com.example.labs_2_geo;
}