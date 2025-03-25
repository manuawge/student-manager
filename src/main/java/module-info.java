module com.example.studentmanagerr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanagerr to javafx.fxml;
    exports com.example.studentmanagerr;
}