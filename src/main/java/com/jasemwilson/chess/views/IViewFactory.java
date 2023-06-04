package com.jasemwilson.chess.views;

import java.lang.reflect.InvocationTargetException;

public interface IViewFactory {

    public View createView(String viewName) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException;
}
