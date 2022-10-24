module com.jasemwilson.chess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jasemwilson.chess to javafx.fxml;
    exports com.jasemwilson.chess;
    exports com.jasemwilson.chess.model.piece;
    opens com.jasemwilson.chess.model.piece to javafx.fxml;
    exports com.jasemwilson.chess.piece;
    opens com.jasemwilson.chess.piece to javafx.fxml;
    exports com.jasemwilson.chess.model.game;
    opens com.jasemwilson.chess.model.game to javafx.fxml;
}
