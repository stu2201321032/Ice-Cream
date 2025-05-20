package shop;

public class IceCreamShop {
    private static IceCreamShop instance;

    private IceCreamShop() {
        System.out.println("Магазинът е създаден!");
    }

    public static IceCreamShop getInstance() {
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }
}