package main;

public class GasPumpedMsg1 extends GasPumpedMsg{
    @Override
    public void GasPumpedMsg(DataStore ds) {
        System.out.println("Number of Litres pumped = "+ds.getL());
        System.out.println("Total = "+ds.getIntTotal());
    }
}
