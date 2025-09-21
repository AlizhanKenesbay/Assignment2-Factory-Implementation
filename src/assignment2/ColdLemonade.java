package assignment2;

public class ColdLemonade implements Beverage {
    private final String name;
    private final double price;

    public ColdLemonade(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public void prepare() {
        System.out.println("Serving cold: " + name);
    }
}