package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's PayMsg
//This is also a Component In Abstract Factory Pattern.
public class PayMsg1 extends PayMsg{
    @Override
    public void PayMsg() {
        System.out.println("------------------");
        System.out.println("Pay By 2.Credit Card");
        System.out.println("Pay By 6.Cash");
        System.out.println("------------------");
    }
}
