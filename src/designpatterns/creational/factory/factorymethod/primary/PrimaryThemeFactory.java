package designpatterns.creational.factory.factorymethod.primary;

import designpatterns.creational.factory.factorymethod.Button;
import designpatterns.creational.factory.factorymethod.Menu;
import designpatterns.creational.factory.factorymethod.ThemeComponentFactory;

public class PrimaryThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
