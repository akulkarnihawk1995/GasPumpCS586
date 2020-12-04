package main;

public class S2 extends State{
    @Override
    public void Activate() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void Start() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void PayDebit() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void PayCash() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void PayCredit() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void Approved() {
        System.out.println("Selected Approved()");
        outPutProcessor.DisplayMenu();
        outPutProcessor.EjectCard();
        mdaefsm.setStates(3);
    }

    @Override
    public void Reject() {
        System.out.println("Selected Reject()");
        outPutProcessor.RejectMsg();
        outPutProcessor.EjectCard();
        mdaefsm.setStates(0);
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void StartPump() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void Cancel() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void Pump() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void StopPump() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void CorrectPin() {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }

    @Override
    public void InCorrectPin(int k) {
        System.out.println("Invalid State. Currently on State S2. Select Approve or Reject");
    }
}
