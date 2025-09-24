package assignment2updated;

public class VendingMachine {
    private final BeverageFactory factory;

    public VendingMachine(BeverageFactory factory) {
        this.factory = factory;
    }

    public void serveHot(String beverageVariant) {
        Beverage beverage = factory.createHot(beverageVariant);
        System.out.println("Vending Machine serving hot: " + beverage.name() + " " + beverage.price() + " tenge");
        beverage.prepare();
        System.out.println();
    }

    public void serveCold(String beverageVariant) {
        Beverage beverage = factory.createCold(beverageVariant);
        System.out.println("Vending Machine serving cold: " + beverage.name() + " " + beverage.price() + " tenge");
        beverage.prepare();
        System.out.println();
    }
}