package com.jasemwilson.chess.controllers;

import com.google.inject.Inject;
import com.jasemwilson.chess.ISceneRouter;

public class MenuController {

    private ISceneRouter _sceneRouter;
    @Inject
    public MenuController(ISceneRouter sceneRouter) {
        _sceneRouter = sceneRouter;
    }

    public void playGame() {
        _sceneRouter.navigateToView("Game");
    }
}
