package main;

public class StorePin2 extends StorePin{
    @Override
    public void StorePin(DataStore ds) {
        ds.setPin(ds.getTemp_p());
    }
}
