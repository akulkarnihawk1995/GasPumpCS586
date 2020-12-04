package main;
//Strategy Pattern
//This is also a product in the Abstract Factory Pattern.
//This contains the implementation for GasPump2's CancelMsg action.
public class CancelMsg2 extends CancelMsg{
    @Override
    public void CancelMsg() {
        System.out.println("Transaction Cancelled Successfully");
    }
}
