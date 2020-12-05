package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's WrongPinMsg
//This is also a Component In Abstract Factory Pattern.
public class WrongPinMsg2 extends WrongPinMsg{

    @Override
    public void WrongPinMsg() {
        System.out.println("The given pin is incorrect. Please Enter Correct Pin. 5-Enter Pin");
    }
}
