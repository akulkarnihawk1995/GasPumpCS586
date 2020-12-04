package main;
// State Pattern
// Concrete State S0 for the MDA-EFSM's State Machine
public class S0 extends State{
    @Override
    public void Activate() {
        System.out.println("Invalid State. Currently on State S0. Please Start");
    }

    @Override
    public void Start() {
        System.out.println("Started Start State");
        outPutProcessor.PayMsg();
        outPutProcessor.InitializeData();
        mdaefsm.setStates(1);
    }

    @Override
    public void PayDebit() {
        System.out.println("Invalid State. Currently on State S0. Please Start");
    }

    @Override
    public void PayCash() {
        System.out.println("Invalid State. Currently on State S0. Please Start");
    }

    @Override
    public void PayCredit() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void Approved() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void Reject() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void StartPump() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void Cancel() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void Pump() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void StopPump() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void CorrectPin() {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }

    @Override
    public void InCorrectPin(int k) {
        System.out.println("Invalid State. Currently on State S0.Please Start");
    }
}
