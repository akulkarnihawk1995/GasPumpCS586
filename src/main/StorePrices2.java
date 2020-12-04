package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's StorePrices
//This is also a Component In Abstract Factory Pattern.
public class StorePrices2 extends StorePrices{
    @Override
    public void StorePrices(DataStore ds) {
        ds.setRprice(ds.getFloatTemp_a());
        ds.setDprice(ds.getTemp_b());
        ds.setSprice(ds.getFloatTemp_c());
    }
}
