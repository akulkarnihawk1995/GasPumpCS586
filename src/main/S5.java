package main;

public class S5 extends State{


    @Override
    public void Activate() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void Start() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void PayDebit() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void PayCash() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void PayCredit() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void Approved() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void Reject() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void StartPump() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void Cancel() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void Pump() {
        outPutProcessor.PumpGasUnit();
        outPutProcessor.GasPumpedMsg();
    }

    @Override
    public void StopPump() {
        outPutProcessor.PrintReceipt();
        mdaefsm.setStates(0);

    }

    @Override
    public void CorrectPin() {
        System.out.println("Invalid State. Currently in State S5");
    }

    @Override
    public void InCorrectPin(int k) {
        System.out.println("Invalid State. Currently in State S5");
    }
}
