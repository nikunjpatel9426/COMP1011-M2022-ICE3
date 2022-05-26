module com.example.comp1011m2022ice3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1011m2022ice3 to javafx.fxml;
    exports com.example.comp1011m2022ice3;
}