package com.jasemwilson.chess.views;

import com.jasemwilson.chess.controllers.GameController;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;

public class GameView extends View {

    private GameController _controller;

    public GameView(GameController controller) {
        _controller = controller;
    }

    @Override
    protected Parent createView() {
        HBox hbox = new HBox();
        Parent graveyardView = new GraveyardView();
        Parent boardView = new BoardView();
        Parent timeView = new TimeView();

        hbox.getChildren().add(graveyardView);
        hbox.getChildren().add(boardView);
        hbox.getChildren().add(timeView);
        return hbox;
    }
}
