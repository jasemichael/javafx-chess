package com.jasemwilson.chess;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) {
        Injector injector = Guice.createInjector(new ChessModule(stage));
        ISceneRouter sceneRouter = injector.getInstance(ISceneRouter.class);
        sceneRouter.navigateToView("Menu");
        stage.setTitle("Chess");
        stage.setMaximized(true);
    }

    public static void main(String[] args) {
        launch();
    }
}
