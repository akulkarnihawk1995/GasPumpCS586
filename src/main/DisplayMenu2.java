package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's DisplayMenu
//This is also a Component In Abstract Factory Pattern.
public class DisplayMenu2 extends DisplayMenu{
    @Override
    public void DisplayMenu() {
        System.out.println("Select Gas Type");
        System.out.println("8-Diesel");
        System.out.println("9-Regular");
        System.out.println("a-Super");
        System.out.println("6-Cancel");
    }
}
