package main;

public class GP2 {
    DataStore dataStore;
    MDAEFSM mdaefsm;

    public void Activate(float a, float b, float c){
        if(a>0 && b>0 && c>0){
            dataStore.setTemp_a(a);
            dataStore.setTemp_b(b);
            dataStore.setTemp_c(c);
            mdaefsm.Activate();
        }
    }
    public void Start(){
        mdaefsm.Start();
    }
    public void PayCredit(){
        mdaefsm.PayCredit();
    }
    public void Reject(){
        mdaefsm.Reject();
    }
    public void PayDebit(String p){
        dataStore.setTemp_p(p);
        mdaefsm.PayDebit();
    }
    public void Pin(String x){
        if(dataStore.getPin().equals(x)){
            mdaefsm.CorrectPin();
        }
        else{
            mdaefsm.IncorrectPin(1);
        }
    }
    public void Cancel(){
        mdaefsm.Cancel();
    }
    public void Approved(){
        mdaefsm.Approved();
    }
    public void Diesel(){
        mdaefsm.SelectGas(3);
    }
    public void Regular(){
        mdaefsm.SelectGas(1);
    }
    public void Super(){
        mdaefsm.SelectGas(2);
    }
    public void StartPump(){
        if(dataStore.getFloatPrice()>0){
            mdaefsm.StartPump();
        }
    }
    public void PumpGallon(){
        mdaefsm.Pump();
    }
    public void FullTank(){
        mdaefsm.StopPump();
    }
    public void StopPump(){
        mdaefsm.StopPump();
    }

    public void Initialize(AbstractFactory af){
        dataStore = af.get_DataStore();
        mdaefsm = new MDAEFSM();
        mdaefsm.Initialize(af);
    }
}
