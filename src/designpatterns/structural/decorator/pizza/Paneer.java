package designpatterns.structural.decorator.pizza;

public class Paneer implements PizzaCreator{
    PizzaCreator pizzaCreator;

    Paneer(PizzaCreator pizzaCreator) {
        if (pizzaCreator==null) {
            throw new NullPointerException();
        }
        this.pizzaCreator = pizzaCreator;
    }

    @Override
    public int getCost() {
        return pizzaCreator.getCost()+25;
    }

    @Override
    public String getConstituents() {
        return pizzaCreator.getConstituents()+" "+"Paneer";
    }
}
