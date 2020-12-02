package main;

import main.AbstractFactory;

public class MDAEFSM {

    State[] states;
    State state;
    int k;
    public void Initialize(AbstractFactory af){
        OutputProcessor op = new OutputProcessor();
        op.Initialize(af);
        states = new State[6];
        states[0] = new S0();
        states[1] = new S1();
        states[2] = new S2();
        states[3] = new S3();
        states[4] = new S5();
        states[5] = new S8();

        //THIS NEEDS TO CHANGE
        state = states[0];
        //CHANGE END

        for(State s:states){
            s.setMdaefsm(this);
            s.setOutPutProcessor(op);
        }
    }
//    public int getK(){
//        return k;
//    }
//    public void setK(int k){
//        this.k = k;
//    }
    public void Activate(){
        state.Activate();
    }
    public void Start(){
        state.Start();
    }
    public void Reject(){
        state.Reject();
    }
    public void Cancel(){
        state.Cancel();
    }
    public void Approved(){
        state.Approved();
    }
    public void StartPump(){
        state.StartPump();
    }
    public void Pump(){
        state.Pump();
    }
    public void StopPump(){
        state.StopPump();
    }
    public void SelectGas(int g){
        state.SelectGas(g);
    }
    public void CorrectPin(){
        state.CorrectPin();
    }
    public void IncorrectPin(int k){
        state.InCorrectPin(k);
    }
    public void PayCash(){
        state.PayCash();
    }
    public void PayCredit(){
        state.PayCredit();
    }
    public void PayDebit(){
        state.PayDebit();
    }
}

