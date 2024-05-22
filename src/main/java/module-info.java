module com.example.proyectonuevo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectonuevo to javafx.fxml;
    exports com.example.proyectonuevo;
}