package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's PayMsg
//This is also a Component In Abstract Factory Pattern.
public class PayMsg2 extends PayMsg{
    @Override
    public void PayMsg() {
        System.out.println("------------------");
        System.out.println("Pay By 2.Credit Card");
        System.out.println("Pay By 4.Debit Card");
        System.out.println("------------------");
    }
}
