package com.jasemwilson.chess.views;

import com.jasemwilson.chess.controllers.MenuController;
import jakarta.inject.Inject;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.lang.reflect.InvocationTargetException;

public class MenuView extends View {

    private MenuController _controller;

    @Inject
    public MenuView(MenuController controller) {
        _controller = controller;
    }

    @Override
    protected Parent createView() {
        VBox vbox = new VBox();
        Label header = new Label("Menu");
        Button button = new Button("Play");
        button.setOnAction((e) -> {
            _controller.playGame();
        });

        vbox.getChildren().add(header);
        vbox.getChildren().add(button);
        return vbox;
    }
}
