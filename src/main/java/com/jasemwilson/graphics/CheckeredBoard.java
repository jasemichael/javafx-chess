package com.jasemwilson.graphics;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CheckeredBoard extends VBox {

    public CheckeredBoard() {
        ObservableList<Node> children = getChildren();
        for(int i=0; i<8; i++) {
            children.add(createRow(i%2));
        }
    }

    private HBox createRow(int offset) {
        HBox row = new HBox();
        for(int i=0; i<8; i++) {
            Color tileColor = (i+offset) % 2 == 0 ? Color.BLACK : Color.RED;
            Rectangle checkeredTile = new Rectangle(20, 20, tileColor);
            row.getChildren().add(checkeredTile);
        }
        return row;
    }
}
