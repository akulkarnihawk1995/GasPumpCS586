package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's SetInitialValues
//This is also a Component In Abstract Factory Pattern.
public class SetInitialValues1 extends SetInitialValues{
    @Override
    public void SetIntialValues(DataStore ds) {
        ds.setL(0);
        ds.setTotal(0);
    }
}
