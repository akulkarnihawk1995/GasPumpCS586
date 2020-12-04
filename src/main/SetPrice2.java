package main;

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
