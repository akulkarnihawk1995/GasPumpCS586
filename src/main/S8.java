package main;

public class S8 extends State{

    @Override
    public void Activate() {
        System.out.println("Invalid State. Currently on State S8. ");
    }

    @Override
    public void Start() {
        System.out.println("Invalid State. Currently on State S8. ");
    }

    @Override
    public void PayDebit() {
        System.out.println("Invalid State. Currently on State S8. ");
    }

    @Override
    public void PayCash() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void PayCredit() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void Approved() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void Reject() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void StartPump() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void Cancel() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void Pump() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void StopPump() {
        System.out.println("Invalid State. Currently on State S8.");
    }

    @Override
    public void CorrectPin() {
        outPutProcessor.DisplayMenu();
        outPutProcessor.EjectCard();
        System.out.println("Transaction Approved");
        mdaefsm.setStates(3);
    }

    @Override
    public void InCorrectPin(int max) {
        if(mdaefsm.k<=max){
            outPutProcessor.WrongPinMsg();
            mdaefsm.k=mdaefsm.k+1;
        }
        else if(mdaefsm.k>max){
            outPutProcessor.WrongPinMsg();
            outPutProcessor.EjectCard();
            mdaefsm.setStates(0);
        }
    }
}
