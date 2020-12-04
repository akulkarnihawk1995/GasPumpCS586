package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's PrintReceipt
//This is also a Component In Abstract Factory Pattern.
public class PrintReceipt2 extends PrintReceipt{
    @Override
    public void PrintReceipt(DataStore ds) {
        System.out.println("-----Receipt-----");
        System.out.println("G="+ds.getG());
        System.out.println("Total= $"+ds.getFloatTotal());
        System.out.println("------------------");
    }
}
