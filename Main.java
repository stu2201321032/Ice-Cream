import shop.IceCreamShop;
import factory.IceCreamFactory;
import factory.IceCreamType;
import icecream.IceCream;
import decorator.ChocolateChips;
import decorator.ChocolateSauce;

public class Main {
    public static void main(String[] args) {
        IceCreamShop shop = IceCreamShop.getInstance();

        IceCreamFactory factory = new IceCreamFactory();

        IceCream iceCream = factory.createIceCream(IceCreamType.VANILLA);
        iceCream = new ChocolateSauce(iceCream);
        iceCream = new ChocolateChips(iceCream);

        System.out.println("Сладоледът е: " + iceCream.getDescription());
        System.out.println("Цена: " + iceCream.getPrice() + " лв.");
    }
}