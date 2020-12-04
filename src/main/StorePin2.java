package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's StorePin
//This is also a Component In Abstract Factory Pattern.
public class StorePin2 extends StorePin{
    @Override
    public void StorePin(DataStore ds) {
        ds.setPin(ds.getTemp_p());
    }
}
