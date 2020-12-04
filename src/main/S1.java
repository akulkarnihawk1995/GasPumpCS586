package main;

public class S1 extends State{
    @Override
    public void Activate() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");
    }

    @Override
    public void Start() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");

    }

    @Override
    public void PayDebit() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");
    }

    @Override
    public void PayCash() {
        System.out.println("PayCash Selected");
        outPutProcessor.StoreCash();
        outPutProcessor.SetW(0);
        outPutProcessor.DisplayMenu();
        mdaefsm.setStates(3);
    }

    @Override
    public void PayCredit() {
        System.out.println("PayCredit Selected");
        outPutProcessor.SetW(1);
        mdaefsm.setStates(2);
        System.out.println("Choose Approved or Reject");
    }

    @Override
    public void Approved() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");
    }

    @Override
    public void Reject() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");

    }

    @Override
    public void SelectGas(int g) {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");
    }

    @Override
    public void StartPump() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");

    }

    @Override
    public void Cancel() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");

    }

    @Override
    public void Pump() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");
    }

    @Override
    public void StopPump() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");

    }

    @Override
    public void CorrectPin() {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");
    }

    @Override
    public void InCorrectPin(int k) {
        System.out.println("Invalid State. Currently on State S1. Select 2.PayCredit or 6.PayCash");
    }
}
