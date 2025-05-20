package decorator;

import icecream.IceCream;

public abstract class IceCreamDecorator extends IceCream {
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.decoratedIceCream = iceCream;
    }
}