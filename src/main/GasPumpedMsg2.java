package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's GasPumpedMsg
//This is also a Component In Abstract Factory Pattern.
public class GasPumpedMsg2 extends GasPumpedMsg{
    @Override
    public void GasPumpedMsg(DataStore ds) {
        System.out.println("Number of Gallons pumped = "+ds.getG());
        System.out.println("Total = "+ds.getFloatTotal());
    }
}
