module dk.easv.calculator2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.calculator2 to javafx.fxml;
    exports dk.easv.calculator2;
}