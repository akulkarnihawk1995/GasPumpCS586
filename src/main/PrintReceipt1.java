package main;

public class PrintReceipt1 extends PrintReceipt{
    @Override
    public void PrintReceipt(DataStore ds) {
        System.out.println("-----Receipt-----");
        System.out.println("L="+ds.getL());
        System.out.println("Total= $"+ds.getIntTotal());
        System.out.println("------------------");
    }
}
