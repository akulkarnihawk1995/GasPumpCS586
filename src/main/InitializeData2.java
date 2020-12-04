package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's InitializeData
//This is also a Component In Abstract Factory Pattern.
public class InitializeData2 extends InitializeData{
    @Override
    public void InitializeDate(DataStore ds) {
        ds.setPrice((float) 0.00);
    }
}
