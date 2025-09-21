package assignment2;

public class HotBeverageFactory implements BeverageFactory {
    @Override
    public Beverage create(String variant) {
        switch (variant.toLowerCase()) {
            case "espresso":
                return new HotCoffee("Espresso", 2000);
            case "americano":
                return new HotCoffee("Americano", 2500);
            case "tea":
                return new HotTea("Black Tea", 1500);
            default:
                throw new IllegalArgumentException("Unknown hot beverage: " + variant);
        }
    }
}