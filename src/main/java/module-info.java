module com.norsula.battleship {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.norsula.battleship to javafx.fxml;
    exports com.norsula.battleship;
}