package designpatterns.structural.decorator.pizza;

public class Customer {

    public static void main(String[] args) {
        PizzaCreator pizzaCreator =  new Corn(new OlivesToppings(new Paneer(
                new ThinCrust(
                    new NormalCrust()
                )
        )));

        System.out.println(pizzaCreator.getCost());
        System.out.println(pizzaCreator.getConstituents());
    }
}
