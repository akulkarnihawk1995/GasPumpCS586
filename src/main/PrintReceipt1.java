package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's PrintReceipt
//This is also a Component In Abstract Factory Pattern.
public class PrintReceipt1 extends PrintReceipt{
    @Override
    public void PrintReceipt(DataStore ds) {
        System.out.println("-----Receipt-----");
        System.out.println("L="+ds.getL());
        System.out.println("Total= $"+ds.getIntTotal());
        System.out.println("------------------");
    }
}
