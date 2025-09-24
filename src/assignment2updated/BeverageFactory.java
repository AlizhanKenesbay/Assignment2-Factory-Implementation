package assignment2updated;

public interface BeverageFactory {
    Beverage createHot(String variant);
    Beverage createCold(String variant);
}