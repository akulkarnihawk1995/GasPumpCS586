package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's PumpGasUnit
//This is also a Component In Abstract Factory Pattern.
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
