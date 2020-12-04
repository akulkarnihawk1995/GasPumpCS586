package main;

import main.AbstractFactory;

public class MDAEFSM {

    private State[] states;
    private State state;
    private int k;
    OutputProcessor op;

    public void Initialize(AbstractFactory af, DataStore d) {
        op = new OutputProcessor();
        op.Initialize(af, d);
        states = new State[7];
        states[0] = new S0();
        states[1] = new S1();
        states[2] = new S2();
        states[3] = new S3();
        states[4] = new S5();
        states[5] = new S8();
        //TAKE CARE HERE
        states[6] = new Activate();

        //THIS NEEDS TO CHANGE
        state = states[6];

        //CHANGE END

        for (State s : states) {
            s.setMdaefsm(this);
            s.setOutPutProcessor(op);
        }
    }

    public void setStates(int state_number) {
        state = states[state_number];
        String state = detectState(state_number);
        System.out.println("Current State is"+state);
    }

    public void Activate() {
        state.Activate();
    }

    public void Start() {
        state.Start();
    }

    public void Reject() {
        state.Reject();
    }

    public void Cancel() {
        state.Cancel();
    }

    public void Approved() {
        state.Approved();
    }

    public void StartPump() {
        state.StartPump();
    }

    public void Pump() {
        state.Pump();
    }

    public void StopPump() {
        state.StopPump();
    }

    public void SelectGas(int g) {
        state.SelectGas(g);
    }

    public void CorrectPin() {
        state.CorrectPin();
    }

    public void IncorrectPin(int k) {
        state.InCorrectPin(k);
    }

    public void PayCash() {
        state.PayCash();
    }

    public void PayCredit() {
        state.PayCredit();
    }

    public void PayDebit() {
        state.PayDebit();
    }

    //Testing Purpose : Show Current State
    String detectState (int a)
    {
        switch (a)
        {
            case 0:
                return "S0";
            case 1:
                return "S1";
            case 2:
                return "S2";
            case 3:
                return "S3";
            case 4:
                return "S5";
            case 5:
                return "S8";
            case 6:
                return "Activate";
            default:
                return "Invalid";
        }
    }
}

