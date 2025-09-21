package assignment2;

public class ColdBeverageFactory implements BeverageFactory {
    @Override
    public Beverage create(String variant) {
        switch (variant.toLowerCase()) {
            case "lemonade":
                return new ColdLemonade("Classic Lemonade", 1800);
            case "icedtea":
                return new ColdLemonade("Iced Tea", 2000);
            default:
                throw new IllegalArgumentException("Unknown cold beverage: " + variant);
        }
    }
}