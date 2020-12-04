package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's StorePrices
//This is also a Component In Abstract Factory Pattern.
public class StorePrices1 extends StorePrices{
    @Override
    public void StorePrices(DataStore ds) {
        ds.setPrice(ds.getIntTemp_a());
        System.out.println("temp_a"+ds.getIntPrice());
    }
}
