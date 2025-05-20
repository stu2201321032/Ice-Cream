package factory;

import icecream.*;

public class IceCreamFactory {
    public IceCream createIceCream(IceCreamType type) {
        switch (type) {
            case VANILLA: return new VanillaIceCream();
            case CHOCOLATE: return new ChocolateIceCream();
            case STRAWBERRY: return new StrawberryIceCream();
            default: throw new IllegalArgumentException("Невалиден тип сладолед.");
        }
    }
}