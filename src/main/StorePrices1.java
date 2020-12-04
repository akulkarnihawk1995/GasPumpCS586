package main;

public class StorePrices1 extends StorePrices{
    @Override
    public void StorePrices(DataStore ds) {
        ds.setPrice(ds.getIntTemp_a());
        System.out.println("temp_a"+ds.getIntPrice());
    }
}
