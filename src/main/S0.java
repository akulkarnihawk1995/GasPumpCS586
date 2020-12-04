package main;

public class S0 extends State{
    @Override
    public void Activate() {
        System.out.println("Invalid State. Currently on State S0");
    }

    @Override
    public void Start() {
        System.out.println("Started Start State");
        outPutProcessor.PayMsg();
        mdaefsm.setStates(1);
    }

    @Override
    public void PayDebit() {

    }

    @Override
    public void PayCash() {

    }

    @Override
    public void PayCredit() {

    }

    @Override
    public void Approved() {

    }

    @Override
    public void Reject() {

    }

    @Override
    public void SelectGas(int g) {

    }

    @Override
    public void StartPump() {

    }

    @Override
    public void Cancel() {

    }

    @Override
    public void Pump() {

    }

    @Override
    public void StopPump() {

    }

    @Override
    public void CorrectPin() {

    }

    @Override
    public void InCorrectPin(int k) {

    }
}
