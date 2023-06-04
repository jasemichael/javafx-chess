package com.jasemwilson.chess.views;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ViewFactory implements IViewFactory {
    @Override
    public View createView(String viewName) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> viewClass = Class.forName("com.jasemwilson.chess.views." + viewName + "View");
        Constructor<?> cons = viewClass.getConstructor();
        return (View) cons.newInstance();
    }
}
