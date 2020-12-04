package main;

public class S3 extends State{
    @Override
    public void Activate() {
        System.out.println("Invalid State. Currently in State S3.");
    }

    @Override
    public void Start() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void PayDebit() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void PayCash() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void PayCredit() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void Approved() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void Reject() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void SelectGas(int g) {
        outPutProcessor.SetPrice(g);
        System.out.println("b. StartPump");
        System.out.println("6. Cancel");
    }

    @Override
    public void StartPump() {
        outPutProcessor.SetInitialValues();
        mdaefsm.setStates(4);
        System.out.println("pump started");
    }

    @Override
    public void Cancel() {
        System.out.println("Cancel called");
        outPutProcessor.CancelMsg();
        mdaefsm.setStates(0);
    }

    @Override
    public void Pump() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void StopPump() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void CorrectPin() {
        System.out.println("Invalid State. Currently in State S3");
    }

    @Override
    public void InCorrectPin(int k) {
        System.out.println("Invalid State. Currently in State S3");
    }
}
