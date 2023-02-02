package com.jasemwilson.chess.controllers;

import com.jasemwilson.chess.ISceneRouter;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController extends Controller {

    private ISceneRouter _sceneRouter;
    public MenuController(ISceneRouter sceneRouter) {
        _sceneRouter = sceneRouter;
    }

    @FXML
    protected void playGame() {
        try {
            _sceneRouter.route("game", new GameController(_sceneRouter));
        } catch(IOException ex) {
            System.out.println("Unable to route to game");
        }

    }
}