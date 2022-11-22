package designpatterns.structural.decorator.pizza;

public class Corn implements PizzaCreator{

    PizzaCreator pizzaCreator;

    Corn(PizzaCreator pizzaCreator) {
        if (pizzaCreator==null) {
            throw new NullPointerException();
        }
        this.pizzaCreator = pizzaCreator;
    }

    @Override
    public int getCost() {
        return pizzaCreator.getCost()+15;
    }

    @Override
    public String getConstituents() {
        return pizzaCreator.getConstituents()+" "+" Corn";
    }
}
