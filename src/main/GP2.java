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
            printDataStore();
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
        printDataStore();
    }
    public void Regular(){
        mdaefsm.SelectGas(1);
        printDataStore();
    }
    public void Super(){
        mdaefsm.SelectGas(2);
        printDataStore();
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
        dataStore = new DataStore2();
        mdaefsm = new MDAEFSM();
        mdaefsm.Initialize(af,dataStore);
    }

    public void printDataStore() {
        System.out.println("-----------datastore--------------");
        System.out.println("temp_a = " + dataStore.getFloatTemp_a());
        System.out.println("temp_b = " + dataStore.getTemp_b());
        System.out.println("temp_c = " + dataStore.getFloatTemp_c());
        System.out.println("G = " + dataStore.getG());
        System.out.println("total = " + dataStore.getFloatTotal());
        System.out.println("Rprice = " + dataStore.getRprice());
        System.out.println("DPrice = " + dataStore.getDprice());
        System.out.println("Super = " + dataStore.getSprice());
        System.out.println("p= = " + dataStore.getTemp_p());
        System.out.println("pin = " + dataStore.getPin());
        System.out.println("price = " + dataStore.getFloatPrice());
        System.out.println("----------------------------");
    }
}
