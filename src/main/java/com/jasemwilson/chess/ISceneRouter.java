package com.jasemwilson.chess;

import com.jasemwilson.chess.controllers.Controller;

import java.io.IOException;

public interface ISceneRouter {
    public void route(String route, Controller controller) throws IOException;
}
