package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's GasPumpedMsg
//This is also a Component In Abstract Factory Pattern.
public class GasPumpedMsg1 extends GasPumpedMsg{
    @Override
    public void GasPumpedMsg(DataStore ds) {
        System.out.println("Number of Litres pumped = "+ds.getL());
        System.out.println("Total = "+ds.getIntTotal());
    }
}
