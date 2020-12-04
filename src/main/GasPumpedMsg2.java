package main;

public class GasPumpedMsg2 extends GasPumpedMsg{
    @Override
    public void GasPumpedMsg(DataStore ds) {
        System.out.println("Number of Gallons pumped = "+ds.getG());
        System.out.println("Total = "+ds.getFloatTotal());
    }
}
