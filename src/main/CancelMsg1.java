package main;
//Strategy Pattern
//This is also a product in the Abstract Factory Pattern.
//This contains the implementation for GasPump1's CancelMsg action.
public class CancelMsg1 extends CancelMsg{
    @Override
    public void CancelMsg() {
        System.out.println("Transaction Cancelled Successfully");
    }
}
