package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's SetInitialValues
//This is also a Component In Abstract Factory Pattern.
public class SetInitialValues2 extends SetInitialValues{
    @Override
    public void SetIntialValues(DataStore ds) {
        if(ds.getFloatPrice()>0){
            ds.setTotal(0);
            ds.setG(0);
        }
        else{
            System.out.println("Price is less than 0. User must select a gas");
        }
    }
}
