//Abstract Factory pattern.
/*abstract part of Abstract Factory This class is the abstract class.
* This is the abstract part of Abstract Factory pattern.
*Abstract Factory is passed around irrespective of underlying Concrete Factory.
* It's products are created like when GP2 calls  Create_DisplayMenu it should return DisplayMenu2 because it's a ConcreteFactory2*/
package main;

public abstract class AbstractFactory {
    DataStore dataStore;
    public abstract StorePrices Create_StorePrices();
    public abstract PayMsg Create_PayMsg();
    public abstract StoreCash Create_StoreCash();
    public abstract DisplayMenu Create_DisplayMenu();
    public abstract RejectMsg Create_RejectMsg();
    public abstract SetPrice Create_SetPrice();
    public abstract SetInitialValues Create_SetInitialValues();
    public abstract PumpGasUnit Create_PumpGasUnit();
    public abstract GasPumpedMsg Create_GasPumpedMsg();
    public abstract PrintReceipt Create_PrintReceipt();
    public abstract CancelMsg Create_CancelMsg();
    public abstract ReturnCash Create_ReturnCash();
    public abstract WrongPinMsg Create_WrongPinMsg();
    public abstract StorePin Create_StorePin();
    public abstract EnterPinMsg Create_EnterPinMsg();
    public abstract SetW Create_SetW();
    public abstract EjectCard Create_EjectCard();
    public abstract InitializeData Create_InitializeData();
    public abstract DataStore get_DataStore();
}
