package main;

public class PrintReceipt2 extends PrintReceipt{
    @Override
    public void PrintReceipt(DataStore ds) {
        System.out.println("-----Receipt-----");
        System.out.println("G="+ds.getG());
        System.out.println("Total= $"+ds.getFloatTotal());
        System.out.println("------------------");
    }
}
