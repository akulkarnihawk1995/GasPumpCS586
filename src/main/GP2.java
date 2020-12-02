package main;

public class GP2 {
    DataStore dataStore;
    MDAEFSM mdaefsm;

    public void Activate(float a, float b, float c){

    }
    public void Start(){

    }
    public void PayCredit(){

    }
    public void Reject(){

    }
    public void PayDebit(String p_debit){

    }
    public void Pin(String pin){

    }
    public void Cancel(){

    }
    public void Approved(){

    }
    public void Diesel(){

    }
    public void Regular(){

    }
    public void StartPump(){

    }
    public void PumpGallon(){

    }
    public void FullTank(){

    }
    public void Super(){

    }
    public void Initialize(AbstractFactory af){
        dataStore = af.get_DataStore();
        mdaefsm = new MDAEFSM();
        mdaefsm.Initialize(af);
    }
}
