package assignment2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo: Hot beverages");
        var hotMachine = new VendingMachine(new HotBeverageFactory());
        hotMachine.serve("espresso");
        hotMachine.serve("tea");

        System.out.println("Demo: Cold beverages");
        var coldMachine = new VendingMachine(new ColdBeverageFactory());
        coldMachine.serve("lemonade");
    }
}