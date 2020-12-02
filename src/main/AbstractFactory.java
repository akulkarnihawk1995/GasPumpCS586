package main;

public abstract class AbstractFactory {
    DataStore ds;
    public abstract StorePrices Create_StorePrices();
    public abstract PayMsg Create_PayMsg();
    public abstract StoreCash Create_StoreCash();
    public abstract DisplayMenu Create_DisplayMenu();
    public abstract RejectMsg Create_RejectMsg();
    public abstract SetPrice Create_SetPrice();
    public abstract ReadyMsg Create_ReadyMsg();
    public abstract SetInitialValues Create_SetInitialValues();
    public abstract PumpGasUnit Create_PumpGasUnit();
    public abstract GasPumpedMsg Create_GasPumpedMsg();
    public abstract CancelMsg Create_CancelMsg();
    public abstract ReturnCash Create_ReturnCash();
    public abstract WrongPinMsg Create_WrongPinMsg();
    public abstract StorePin Create_StorePin();
    public abstract EnterPinMsg Create_EnterPinMsg();
    public abstract SetW Create_SetW();
    public abstract EjectCard Create_EjectCard();
    public abstract DataStore get_DataStore();
}
