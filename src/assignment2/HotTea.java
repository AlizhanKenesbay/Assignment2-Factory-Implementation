package assignment2;

public class HotTea implements Beverage {
    private final String name;
    private final double price;

    public HotTea(String name, double price) {
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
        System.out.println("Pouring hot tea: " + name);
    }
}