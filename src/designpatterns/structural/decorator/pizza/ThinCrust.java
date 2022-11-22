package designpatterns.structural.decorator.pizza;

import java.security.InvalidParameterException;

public class ThinCrust implements PizzaCreator{
    PizzaCreator pizzaCreator;

    public ThinCrust() {

    }

    public ThinCrust(PizzaCreator pizzaCreator) {
        String res = pizzaCreator.getConstituents();
        String []constituents = res.split(" ");
        if(constituents[constituents.length-1].contains("Paneer") ||
                constituents[constituents.length-1].contains("Olive") ||
                constituents[constituents.length-1].contains("Corn"))
            throw new InvalidParameterException();
        this.pizzaCreator = pizzaCreator;
    }
    @Override
    public int getCost() {
        return pizzaCreator.getCost()+20;
    }

    @Override
    public String getConstituents() {
        return pizzaCreator.getConstituents()+" "+"ThinCrust";
    }
}
