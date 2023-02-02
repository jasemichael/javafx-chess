package com.jasemwilson.chess;

import com.jasemwilson.chess.controllers.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class SceneRouter implements ISceneRouter {

    private Stage _stage;
    public SceneRouter(Stage stage) {
        _stage = stage;
    }

    public void route(String route, Controller controller) throws IOException {
        String fxmlFilename = route + ".fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(fxmlFilename));
        fxmlLoader.setController(controller);
        _stage.setScene(new Scene(fxmlLoader.load(), _stage.getWidth(), _stage.getHeight()));
        _stage.show();
    }
}
