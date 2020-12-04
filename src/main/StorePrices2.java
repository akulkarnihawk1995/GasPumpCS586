package main;

public class StorePrices2 extends StorePrices{
    @Override
    public void StorePrices(DataStore ds) {
        ds.setRprice(ds.getFloatTemp_a());
        ds.setDprice(ds.getTemp_b());
        ds.setSprice(ds.getFloatTemp_c());
    }
}
