package main;

public class PumpGasUnit1 extends PumpGasUnit{
    @Override
    public void PumpGasUnit(DataStore ds) {
        int total = ds.getIntTotal();
        int cash = ds.getCash();
        int w = ds.getW();
        int price = ds.getIntPrice();
        int L = ds.getL();

        if((w==1) || (w==0&& (cash>=price*(L+1)))){
            L=L+1;
            total = price*L;
          ds.setL(L);
          ds.setTotal(total);
        }
    }
}
