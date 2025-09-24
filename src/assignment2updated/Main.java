package assignment2updated;

public class Main {
    public static void main(String[] args) {
        BeverageFactory factory = new StandardBeverageFactory();
        VendingMachine machine = new VendingMachine(factory);

        System.out.println("Hot beverages");
        machine.serveHot("espresso");
        machine.serveHot("tea");

        System.out.println("Cold beverages");
        machine.serveCold("lemonade");
        machine.serveCold("icedtea");
    }
}