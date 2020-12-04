package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's RejectMsg
//This is also a Component In Abstract Factory Pattern.
public class RejectMsg1 extends RejectMsg{
    @Override
    public void RejectMsg() {
        System.out.println("Card Rejected");
        System.out.println("-------------------");
    }
}
