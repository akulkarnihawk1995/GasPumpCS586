package main;

public class GP1 {
    private DataStore dataStore;
    private MDAEFSM m;

    public void Activate(int a) {
        if(a>0){
            dataStore.setTemp_a(a);
            m.Activate();
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
            dataStore.setTemp_c(c);
            m.PayCash();
        }
    }

    public void StartPump() {
        m.StartPump();
    }

    public void PumpLiter() {
        if(dataStore.getW()==1){
            m.Pump();
        }
        else if((dataStore.getCash()>0) && (dataStore.getCash()<dataStore.getIntPrice()*(dataStore.getL()+1))){
            m.StopPump();
        }
        else {
            m.StopPump();
        }
    }

    public void StopPump() {
        m.StopPump();
    }
    public void Initialize(AbstractFactory af){
        dataStore = af.get_DataStore();
        m = new MDAEFSM();
        m.Initialize(af);
    }
}
