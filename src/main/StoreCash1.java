package main;

public class StoreCash1 extends StoreCash{
    @Override
    public void StoreCash(DataStore ds) {
        ds.setCash(ds.getIntTemp_c());
    }
}
