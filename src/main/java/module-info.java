module com.jasemwilson.chess {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.jasemwilson.chess to javafx.fxml;
    opens com.jasemwilson.graphics to javafx.fxml;
    exports com.jasemwilson.chess;
    exports com.jasemwilson.chess.controllers;
    opens com.jasemwilson.chess.controllers to javafx.fxml;
}