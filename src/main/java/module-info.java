module htl.steyr.gollop {
    requires javafx.controls;
    requires javafx.fxml;


    opens htl.steyr.gollop to javafx.fxml;
    exports htl.steyr.gollop;
}