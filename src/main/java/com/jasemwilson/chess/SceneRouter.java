package com.jasemwilson.chess;

import com.google.inject.Inject;
import com.jasemwilson.chess.views.IViewFactory;
import com.jasemwilson.chess.views.MenuView;
import com.jasemwilson.chess.views.View;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.InvocationTargetException;

public class SceneRouter implements ISceneRouter {

    private final Stage _stage;
    private final IViewFactory _viewFactory;

    @Inject
    public SceneRouter(Stage stage, IViewFactory viewFactory) {
        _stage = stage;
        _viewFactory = viewFactory;
    }

    public void navigateToView(String viewName) {
        try {
            View view = _viewFactory.createView(viewName);
            Scene scene = new Scene(view);
            _stage.setScene(scene);
            _stage.show();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
