package main;

import main.DataStore;

public class OutputProcessor {
        private DataStore ds;
        private StorePrices storePrices;
        private PayMsg payMsg;
        private StoreCash storeCash;
        private DisplayMenu displayMenu;
        private RejectMsg rejectMsg;
        private SetPrice setPrice;
        private SetInitialValues setInitialValues;
        private PumpGasUnit pumpGasUnit;
        private GasPumpedMsg gasPumpedMsg;
        private PrintReceipt printReceipt;
        private CancelMsg cancelMsg;
        private ReturnCash returnCash;
        private WrongPinMsg wrongPinMsg;
        private StorePin storePin;
        private EnterPinMsg enterPinMsg;
        private InitializeData initializeData;
        private SetW setW;
        private EjectCard ejectCard;
        public void Initialize(AbstractFactory af){
                ds = af.get_DataStore();
                storePrices = af.Create_StorePrices();
                payMsg = af.Create_PayMsg();
                storeCash = af.Create_StoreCash();
                displayMenu = af.Create_DisplayMenu();
                rejectMsg = af.Create_RejectMsg();
                setPrice = af.Create_SetPrice();
                setInitialValues = af.Create_SetInitialValues();
                pumpGasUnit = af.Create_PumpGasUnit();
                gasPumpedMsg = af.Create_GasPumpedMsg();
                printReceipt = af.Create_PrintReceipt();
                cancelMsg = af.Create_CancelMsg();
                returnCash = af.Create_ReturnCash();
                wrongPinMsg = af.Create_WrongPinMsg();
                storePin = af.Create_StorePin();
                enterPinMsg = af.Create_EnterPinMsg();
                initializeData = af.Create_InitializeDate();
                setW = af.Create_SetW();
                ejectCard=af.Create_EjectCard();
        }
        public void setStorePrices(){
                storePrices.StorePrices(ds);
        }
        public void setPayMsg(){
                payMsg.PayMsg();
        }
        public void setStoreCash(){
                storeCash.StoreCash(ds);
        }
        public void setDisplayMenu(){
                displayMenu.DisplayMenu();
        }
        public void setRejectMsg(){
                rejectMsg.RejectMsg();
        }
        public void setSetPrice(int g){
               setPrice.SetPrice(ds,g);
        }
        public void setSetInitialValues(){
                setInitialValues.SetIntialValues(ds);
        }
        public void setPumpGasUnit(){
                pumpGasUnit.PumpGasUnit(ds);
        }
        public void setGasPumpedMsg(){
                gasPumpedMsg.GasPumpedMsg(ds);
        }
        public void setPrintReceipt(){
                printReceipt.PrintReceipt(ds);
        }
        public void setCancelMsg(){
                cancelMsg.CancelMsg();
        }
        public void setReturnCash(){
                returnCash.ReturnCash(ds);
        }
        public void setWrongPinMsg(){
                wrongPinMsg.WrongPinMsg();
        }
        public void setStorePin(){
                storePin.StorePin(ds);
        }
        public void setEnterPinMsg(){
                enterPinMsg.EnterPinMsg();
        }
        public void setInitializeData(){
                initializeData.InitializeDate(ds);
        }
        public void setSetW() {
                setW.SetW(ds);
        }
        public void setEjectCard(){
                ejectCard.EjectCard(ds);
        }
}
