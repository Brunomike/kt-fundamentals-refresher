module com.example.student {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.student to javafx.fxml;
    exports com.example.student;
}