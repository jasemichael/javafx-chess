package com.jasemwilson.chess.views;

import javafx.scene.Parent;

public abstract class View extends Parent {

    public View() {
        Parent view = createView();
        getChildren().add(view);
    }

    protected abstract Parent createView();

}
