package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's SetW
//This is also a Component In Abstract Factory Pattern.
public class SetW1 extends SetW{
    @Override
    public void SetW(DataStore ds, int w) {
        ds.setW(w);
    }
}
