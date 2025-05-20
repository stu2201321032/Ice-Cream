package decorator;

import icecream.IceCream;

public class ChocolateSauce extends IceCreamDecorator {
    public ChocolateSauce(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return decoratedIceCream.getDescription() + " + шоколадова глазура";
    }

    @Override
    public double getPrice() {
        return decoratedIceCream.getPrice() + 0.50;
    }
}