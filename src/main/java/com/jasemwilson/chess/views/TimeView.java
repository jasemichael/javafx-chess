package com.jasemwilson.chess.views;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TimeView extends View {

    @Override
    protected Parent createView() {
        VBox vbox = new VBox();
        Label label = new Label("Time View");

        vbox.getChildren().add(label);
        return vbox;
    }
}
