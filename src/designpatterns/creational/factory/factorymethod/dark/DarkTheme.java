package designpatterns.creational.factory.factorymethod.dark;

import designpatterns.creational.factory.factorymethod.Theme;
import designpatterns.creational.factory.factorymethod.ThemeComponentFactory;

public class DarkTheme extends Theme {

    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new DarkThemeFactory();
    }
}
