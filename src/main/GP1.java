package main;

public class GP1 {
    private DataStore d;
    private MDAEFSM m;

    public void Activate(int a) {
    }

    public void Start() {
    }

    public void PayCredit() {
    }

    public void Reject() {
    }

    public void Cancel() {
    }

    public void Approved() {
    }

    public void PayCash(int c) {
    }

    public void StartPump() {
    }

    public void PumpLiter() {
    }

    public void StopPump() {

    }
    public void Initialize(AbstractFactory af){
        d = af.get_DataStore();
        m = new MDAEFSM();
        m.Initialize(af);
    }
}
