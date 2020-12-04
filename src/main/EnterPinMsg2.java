package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's EnterPinMessage
//This is also a Component In Abstract Factory Pattern.
public class EnterPinMsg2 extends EnterPinMsg{
    @Override
    public void EnterPinMsg() {
        System.out.println("Please Enter Your Pin");
        System.out.println("Select 5-Pin");
    }
}
