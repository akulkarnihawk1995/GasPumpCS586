package main;

public class ConcreteFactory2 extends AbstractFactory{

    @Override
    public StorePrices Create_StorePrices() {
        return new StorePrices2();
    }

    @Override
    public PayMsg Create_PayMsg() {
        return new PayMsg2();
    }

    @Override
    public StoreCash Create_StoreCash() {
        return new StoreCash2();
    }

    @Override
    public DisplayMenu Create_DisplayMenu() {
        return new DisplayMenu2();
    }

    @Override
    public RejectMsg Create_RejectMsg() {
        return new RejectMsg2();
    }

    @Override
    public SetPrice Create_SetPrice() {
        return new SetPrice2();
    }

    @Override
    public SetInitialValues Create_SetInitialValues() {
        return new SetInitialValues2();
    }

    @Override
    public PumpGasUnit Create_PumpGasUnit() {
        return new PumpGasUnit2();
    }

    @Override
    public GasPumpedMsg Create_GasPumpedMsg() {
        return new GasPumpedMsg2();
    }

    @Override
    public PrintReceipt Create_PrintReceipt() {
        return new PrintReceipt2();
    }

    @Override
    public CancelMsg Create_CancelMsg() {
        return new CancelMsg2();
    }

    @Override
    public ReturnCash Create_ReturnCash() {
        return new ReturnCash2();
    }

    @Override
    public WrongPinMsg Create_WrongPinMsg() {
        return new WrongPinMsg2();
    }

    @Override
    public StorePin Create_StorePin() {
        return new StorePin2();
    }

    @Override
    public EnterPinMsg Create_EnterPinMsg() {
        return new EnterPinMsg2();
    }

    @Override
    public SetW Create_SetW() {
        return new SetW2();
    }

    @Override
    public EjectCard Create_EjectCard() {
        return new EjectCard2();
    }

    @Override
    public InitializeData Create_InitializeDate() {
        return new InitializeData2();
    }

    @Override
    public DataStore get_DataStore() {
        return null;
    }
}
