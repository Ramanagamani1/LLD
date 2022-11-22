package designpatterns.creational.factory.factorymethod;

//Step 1 - Create parent class
// step 4 - add factory method
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;

    public abstract ThemeComponentFactory createComponentFactory();
}
