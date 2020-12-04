package main;
// AbstractFactory Pattern
//This class contains ConcreteFactory1 which will be a ConcreteFactory for our GasPump1(GP1).
//This will return the actions that are GasPump1's
//This also create DataStore1
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public StorePrices Create_StorePrices() {
        return new StorePrices1();
    }

    @Override
    public PayMsg Create_PayMsg() {
        return new PayMsg1();
    }

    @Override
    public StoreCash Create_StoreCash() {
        return new StoreCash1();
    }

    @Override
    public DisplayMenu Create_DisplayMenu() {
        return new DisplayMenu1();
    }

    @Override
    public RejectMsg Create_RejectMsg() {
        return new RejectMsg1();
    }

    @Override
    public SetPrice Create_SetPrice() {
        return new SetPrice1();
    }

    @Override
    public SetInitialValues Create_SetInitialValues() {
        return new SetInitialValues1();
    }

    @Override
    public PumpGasUnit Create_PumpGasUnit() {
        return new PumpGasUnit1();
    }

    @Override
    public GasPumpedMsg Create_GasPumpedMsg() {
        return new GasPumpedMsg1();
    }

    @Override
    public PrintReceipt Create_PrintReceipt() {
      return new PrintReceipt1();
    }

    @Override
    public CancelMsg Create_CancelMsg() {
        return new CancelMsg1();
    }

    @Override
    public ReturnCash Create_ReturnCash() {
        return new ReturnCash1();
    }

    @Override
    public WrongPinMsg Create_WrongPinMsg() {
        return new WrongPinMsg1();
    }

    @Override
    public StorePin Create_StorePin() {
        return new StorePin1();
    }

    @Override
    public EnterPinMsg Create_EnterPinMsg() {
        return new EnterPinMsg1();
    }

    @Override
    public SetW Create_SetW() {
        return new SetW1();
    }

    @Override
    public EjectCard Create_EjectCard() {
       return new EjectCard1();
    }

    @Override
    public InitializeData Create_InitializeData() {
        return new InitializeData1();
    }

    @Override
    public DataStore get_DataStore() {
        return new DataStore1();
    }
}
