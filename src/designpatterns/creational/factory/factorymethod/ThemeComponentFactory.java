package designpatterns.creational.factory.factorymethod;

// step3 - create component factory
public interface ThemeComponentFactory {
       Button createButton();
       Menu createMenu();
}
