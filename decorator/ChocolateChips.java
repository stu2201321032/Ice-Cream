package decorator;

import icecream.IceCream;

public class ChocolateChips extends IceCreamDecorator {
    public ChocolateChips(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return decoratedIceCream.getDescription() + " + шоколадови пръчици";
    }

    @Override
    public double getPrice() {
        return decoratedIceCream.getPrice() + 0.25;
    }
}