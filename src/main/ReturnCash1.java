package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP1's ReturnCash
//This is also a Component In Abstract Factory Pattern.
public class ReturnCash1 extends ReturnCash{
    @Override
    public void ReturnCash(DataStore ds) {
        if(ds.getW()==0){
            System.out.println("Inserted Cash was returned");
        }
    }
}
