package main;

public abstract class State {
    OutputProcessor outPutProcessor;
    MDAEFSM mdaefsm;

    public void setOutPutProcessor(OutputProcessor outPutProcessor) {
        this.outPutProcessor = outPutProcessor;
    }
    public void setMdaefsm(MDAEFSM mdaefsm){
        this.mdaefsm = mdaefsm;
    }
    public abstract void Activate();
    public abstract void Start();
    public abstract void PayDebit();
    public abstract void PayCash();
    public abstract void PayCredit();
    public abstract void Approved();
    public abstract void Reject();
    public abstract void SelectGas(int g);
    public abstract void StartPump();
    public abstract void Cancel();
    public abstract void Pump();
    public abstract void StopPump();
    public abstract void CorrectPin();
    public abstract void InCorrectPin(int k);
}
