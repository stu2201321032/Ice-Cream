package icecream;

public class VanillaIceCream extends IceCream {
    @Override
    public String getDescription() {
        return "Ванилов сладолед";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}