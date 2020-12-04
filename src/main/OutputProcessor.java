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
        public void Initialize(AbstractFactory af,DataStore dataStore){
                ds = dataStore;
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
                initializeData = af.Create_InitializeData();
                setW = af.Create_SetW();
                ejectCard=af.Create_EjectCard();
        }

        public void StorePrices(){storePrices.StorePrices(ds);}
        public void PayMsg(){
                payMsg.PayMsg();
        }
        public void StoreCash(){
                storeCash.StoreCash(ds);
        }
        public void DisplayMenu(){
                displayMenu.DisplayMenu();
        }
        public void RejectMsg(){
                rejectMsg.RejectMsg();
        }
        public void SetPrice(int g){
               setPrice.SetPrice(ds,g);
        }
        public void SetInitialValues(){
                setInitialValues.SetIntialValues(ds);
        }
        public void PumpGasUnit(){
                pumpGasUnit.PumpGasUnit(ds);
        }
        public void GasPumpedMsg(){
                gasPumpedMsg.GasPumpedMsg(ds);
        }
        public void PrintReceipt(){
                printReceipt.PrintReceipt(ds);
        }
        public void CancelMsg(){
                cancelMsg.CancelMsg();
        }
        public void ReturnCash(){
                returnCash.ReturnCash(ds);
        }
        public void WrongPinMsg(){
                wrongPinMsg.WrongPinMsg();
        }
        public void StorePin(){
                storePin.StorePin(ds);
        }
        public void EnterPinMsg(){
                enterPinMsg.EnterPinMsg();
        }
        public void InitializeData(){
                initializeData.InitializeDate(ds);
        }
        public void SetW() {
                setW.SetW(ds);
        }
        public void EjectCard(){
                ejectCard.EjectCard(ds);
        }
}
