package assignment2updated;

public class StandardBeverageFactory implements BeverageFactory {
    @Override
    public Beverage createHot(String variant) {
        switch (variant.toLowerCase()) {
            case "espresso":
                return new HotDrink("Espresso", 2000);
            case "americano":
                return new HotDrink("Americano", 2500);
            case "black tea":
                return new HotDrink("Black Tea", 1500);
            default:
                throw new IllegalArgumentException("Unknown hot beverage: " + variant);
        }
    }

    @Override
    public Beverage createCold(String variant) {
        switch (variant.toLowerCase()) {
            case "lemonade":
                return new ColdDrink("Classic Lemonade", 1800);
            case "icedtea":
                return new ColdDrink("Iced Tea", 2000);
            default:
                throw new IllegalArgumentException("Unknown cold beverage: " + variant);
        }
    }
}