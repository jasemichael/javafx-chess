package com.jasemwilson.chess;

import com.google.inject.AbstractModule;
import com.jasemwilson.chess.controllers.MenuController;
import com.jasemwilson.chess.views.IViewFactory;
import com.jasemwilson.chess.views.ViewFactory;
import javafx.stage.Stage;

public class ChessModule extends AbstractModule {

    private final Stage stage;

    public ChessModule(Stage stage) {
        this.stage = stage;
    }


    @Override
    protected void configure() {
        bind(ISceneRouter.class).to(SceneRouter.class);
        bind(IViewFactory.class).to(ViewFactory.class);
        bind(Stage.class).toInstance(this.stage);
    }
}
