module com.example.firstfxme {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstfxme to javafx.fxml;
    exports com.example.firstfxme;
}