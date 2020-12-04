package main;

public class PumpGasUnit2 extends PumpGasUnit{
    @Override
    public void PumpGasUnit(DataStore ds) {
        float price  = ds.getFloatPrice();
        float total  = ds.getFloatTotal();
        int G = ds.getG();
        //calculate
        G = G +1;
        total = price*G;
        ds.setG(G);
        ds.setTotal(total);
    }
}
