package com.jasemwilson.chess;

import com.jasemwilson.chess.views.MenuView;
import com.jasemwilson.chess.views.View;

import java.lang.reflect.InvocationTargetException;

public interface ISceneRouter {
    public void navigateToView(String viewName);
}
