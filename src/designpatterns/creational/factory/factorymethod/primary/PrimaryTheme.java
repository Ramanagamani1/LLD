package designpatterns.creational.factory.factorymethod.primary;

import designpatterns.creational.factory.factorymethod.Theme;
import designpatterns.creational.factory.factorymethod.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new PrimaryThemeFactory();
    }
}
