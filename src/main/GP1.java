package main;
// This class has a Model for GP1 or GasPump-1.
// In the Initialize method of this class it'll get the DataStore and also initializes MDA_EFMS OutputProcessor OP and DataStore.
//This class has methods that'll be called by Driver program
public class GP1 {
    private DataStore d;
    private MDAEFSM m;

    public void printDataStore() {
        System.out.println("-----------datastore--------------");
        System.out.println("temp_c = " + d.getIntTemp_c());
        System.out.println("cash = " + d.getCash());
        System.out.println("total = " + d.getIntTotal());
        System.out.println("L = " + d.getL());
        System.out.println("price = " + d.getIntPrice());
        System.out.println("temp_a = " + d.getIntTemp_a());
        System.out.println("w = " + d.getW());
        System.out.println("----------------------------");
    }

    public void Activate(int a) {
        if(a>0){
            d.setTemp_a(a);
           // System.out.println("Before");
            //printDataStore();
            m.Activate();
            System.out.println("After");
            //printDataStore();
        }
    }

    public void Start() {
        m.Start();
    }

    public void PayCredit() {
        m.PayCredit();
    }

    public void Reject() {
        m.Reject();
    }

    public void Cancel() {
        m.Cancel();
    }

    public void Approved() {
        m.Approved();
    }

    public void PayCash(int c) {
        if(c>0){
            d.setTemp_c(c);
            m.PayCash();
            //printDataStore();
        }
    }

    public void StartPump() {
        m.StartPump();
    }

    public void PumpLiter()
    {
        if ( d.getW() == 1)
        {
            m.Pump();
        }
        else if (d.getCash() > 0 && (d.getCash() < d.getIntPrice() * (d.getL() + 1)))
        {
            m.StopPump();
        }
        else
        {
            m.Pump();
        }
    }

    public void StopPump() {
        m.StopPump();
    }
    public void Initialize(AbstractFactory af){
        d = new DataStore1();
        m = new MDAEFSM();
        m.Initialize(af,d);
    }
}
