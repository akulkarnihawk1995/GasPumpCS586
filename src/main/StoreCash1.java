package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's StoreCash
//This is also a Component In Abstract Factory Pattern.
public class StoreCash1 extends StoreCash{
    @Override
    public void StoreCash(DataStore ds) {
        ds.setCash(ds.getIntTemp_c());
    }
}
