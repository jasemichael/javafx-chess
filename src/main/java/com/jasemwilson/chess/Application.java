package com.jasemwilson.chess;

import com.jasemwilson.chess.controllers.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        ISceneRouter sceneRouter = new SceneRouter(stage);
        sceneRouter.route("menu", new MenuController(sceneRouter));
        stage.setTitle("Chess");
    }

    public static void main(String[] args) {
        launch();
    }
}