package designpatterns.structural.decorator.pizza;

import java.security.InvalidParameterException;

public class NormalCrust implements PizzaCreator{
    /*PizzaCreator pizzaCreator;

    public NormalCrust() {

    }

    NormalCrust(PizzaCreator pizzaCreator) {
        String res = pizzaCreator.getConstituents();
        String []constituents = res.split(" ");
        if(constituents[constituents.length-1].contains("Paneer") ||
                constituents[constituents.length-1].contains("Olive") ||
                constituents[constituents.length-1].contains("Corn"))
            throw new InvalidParameterException();
        this.pizzaCreator = pizzaCreator;
    }*/
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getConstituents() {
        return "Normal Crust";
    }
}
