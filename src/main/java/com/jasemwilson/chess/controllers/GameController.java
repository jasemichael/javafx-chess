package com.jasemwilson.chess.controllers;

import com.jasemwilson.chess.ISceneRouter;

public class GameController extends Controller {
    private ISceneRouter _sceneRouter;
    public GameController(ISceneRouter sceneRouter) {
        _sceneRouter = sceneRouter;
    }
}
