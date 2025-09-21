package assignment2;

public class VendingMachine {
    private final BeverageFactory factory;

    public VendingMachine(BeverageFactory factory) {
        this.factory = factory;
    }

    public void serve(String beverageVariant) {
        Beverage beverage = factory.create(beverageVariant);
        System.out.println("Vending Machine serving: " + beverage.name() + " (" + beverage.price() + " tenge)");
        beverage.prepare();
        System.out.println();
    }
}