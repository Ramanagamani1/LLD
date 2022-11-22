package designpatterns.structural.decorator.icecream;

public class Customer {
    public static void main(String[] args) {

        IceCreamCone chocobar = new ChocolateScoop(
                new ChocolateScoop( new BlueCone())
        );

        IceCreamCone kesarPista = new VanillaScoop(new OrangeCone());

        IceCreamCone iceCreamCone =
                new VanillaScoop(
                    new ChocolateScoop(
                        new VanillaScoop(
                            new OrangeCone()
                        )
                    )
                );
        System.out.println(iceCreamCone.getCost());
        System.out.println(iceCreamCone.getConstituents());

        IceCreamCone chocoWithOneVanilla = new VanillaScoop(chocobar);
    }
}
