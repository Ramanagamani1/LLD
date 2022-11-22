package designpatterns.structural.decorator.icecream;

import java.security.InvalidParameterException;

public class BlueCone implements IceCreamCone{
    public BlueCone() {

    }

    public BlueCone(IceCreamCone iceCreamCone){
        if (iceCreamCone.getConstituents().contains("scoop"))
            throw new InvalidParameterException();
    }

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getConstituents() {
        return "Blue Cone";
    }
}

// implement Pizza Ordering System
// ThinCrust, Normal, Pan
// 5 toppings =>
// you can have more than 1 base but can't sandwich
/*
     TextPrinter {
       printText()
    }
    add following decorations
    - encrypted printed text
    - encode printed text
 */
