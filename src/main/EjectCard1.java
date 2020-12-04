package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's EjectCard
//This is also a Component In Abstract Factory Pattern.
public class EjectCard1 extends EjectCard{
    @Override
    public void EjectCard(DataStore ds) {
        System.out.println("Successfully Ejected Card");
        System.out.println("-------------------------");
    }
}
