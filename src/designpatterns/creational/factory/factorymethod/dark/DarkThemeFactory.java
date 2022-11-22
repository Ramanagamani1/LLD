package designpatterns.creational.factory.factorymethod.dark;

import designpatterns.creational.factory.factorymethod.Button;
import designpatterns.creational.factory.factorymethod.Menu;
import designpatterns.creational.factory.factorymethod.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
