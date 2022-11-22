package designpatterns.creational.factory.factorymethod;

import designpatterns.creational.factory.factorymethod.primary.PrimaryTheme;

public class Client {
    public static void main(String[] args) {
        Theme primaryTheme = new PrimaryTheme();
        ThemeComponentFactory componentFactory = primaryTheme.createComponentFactory();

        Button button = componentFactory.createButton();
        Menu menu = componentFactory.createMenu();
    }
}
