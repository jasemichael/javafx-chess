module com.jasemwilson.chess {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.guice;
    requires jakarta.inject;

    opens com.jasemwilson.chess to javafx.fxml;
    exports com.jasemwilson.chess;
    exports com.jasemwilson.chess.controllers;
    exports com.jasemwilson.chess.views;
    opens com.jasemwilson.chess.controllers to javafx.fxml;
}
