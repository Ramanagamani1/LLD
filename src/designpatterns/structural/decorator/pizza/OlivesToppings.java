package designpatterns.structural.decorator.pizza;

public class OlivesToppings implements PizzaCreator{
    PizzaCreator pizzaCreator;

    OlivesToppings(PizzaCreator pizzaCreator) {
        if (pizzaCreator==null) {
            throw new NullPointerException();
        }
        this.pizzaCreator = pizzaCreator;
    }
    @Override
    public int getCost() {
        return pizzaCreator.getCost()+10;
    }

    @Override
    public String getConstituents() {
        return pizzaCreator.getConstituents()+" "+"Olives";
    }
}
