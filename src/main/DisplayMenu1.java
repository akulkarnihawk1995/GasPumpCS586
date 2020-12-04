package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's DisplayMenu
//This is also a Component In Abstract Factory Pattern.
public class DisplayMenu1 extends DisplayMenu{
    @Override
    public void DisplayMenu() {
        System.out.println("---------Select Option ---------------");
        System.out.println("7. Start Pump");
        System.out.println("-------------------------");
        System.out.println("4. Cancel");
    }
}
