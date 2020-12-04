package main;

public class S3 extends State{



    @Override
    public void Activate() {

    }

    @Override
    public void Start() {

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
        outPutProcessor.SetPrice(g);
        System.out.println("b. StartPump");
        System.out.println("6. Cancel");
    }

    @Override
    public void StartPump() {

    }

    @Override
    public void Cancel() {
        System.out.println("Cancel called");
        outPutProcessor.CancelMsg();
        mdaefsm.setStates(0);
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
