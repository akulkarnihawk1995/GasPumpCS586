package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's RejectMsg
//This is also a Component In Abstract Factory Pattern.
public class RejectMsg2 extends RejectMsg{
    @Override
    public void RejectMsg() {
        System.out.println("Card Rejected");
        System.out.println("-------------------");
    }
}
