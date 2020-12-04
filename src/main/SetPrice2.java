package main;
//Strategy Pattern
//This Strategy class contains the concrete implementation that will be used by GP2's SetPrice
//This is also a Component In Abstract Factory Pattern.
public class SetPrice2 extends SetPrice{
    @Override
    public void SetPrice(DataStore ds, int price) {
        switch (price){
            case 1:
                System.out.println("Regular Selected");
                ds.setPrice(ds.getRprice());
                break;
            case 2:
                System.out.println("Super Selected");
                ds.setPrice(ds.getSprice());
                break;
            case 3:
                System.out.println("Diesel Selected");
                ds.setPrice(ds.getDprice());
                break;
        }
    }
}
