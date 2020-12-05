package main;
// State Pattern
// Concrete State S0 for the MDA-EFSM's State Machine
public class Activate extends State {

    public void Activate() {
        outPutProcessor.StorePrices();
        mdaefsm.setStates(0);
    }


    @Override
    public void Start() {
        System.out.println("Invalid State. Please Activate().");
    }

    @Override
    public void PayDebit() {
        System.out.println("Invalid State. Please Activate().");
    }

    @Override
    public void PayCash() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void PayCredit() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void Approved() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void Reject() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void StartPump() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void Cancel() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void Pump() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void StopPump() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void CorrectPin() {
        System.out.println("Invalid State. Please Activate()");
    }

    @Override
    public void InCorrectPin(int k) {
        System.out.println("Invalid State. Please Activate()");
    }
}
