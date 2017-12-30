package abstractfactory;

/**
 * @author shraddha
 *
 */

import datastore.DataStore;
import datastore.DataStore1;
import strategypattern.*;


public class ConcreteFactory1 implements AbstractFactory {

		DataStore dataStore = new DataStore1();
		StoreData storeData = new StoreData1();
		DisplayMenu displayMenu = new DisplayMenu1();
		PayMsg payMsg = new PayMsg1();
		SetPrice setPrice = new SetPrice1();
		SetInitialValues setInitVal = new SetInitialValues1();
		PumpGasUnit pumpGasUnit = new PumpGasUnit1();
		PrintReceipt printReceipt = new PrintReceipt1();  //doubt setw
		StopMsg stopMsg = new StopMsg1();
		RejectMsg rejectMsg = new RejectMsg1();
		CancelMsg cancelMsg = new CancelMsg1();
		ReadyMsg readyMsg = new ReadyMsg1();
		GasPumpedMsg gasPumpedMsg = new GasPumpedMsg1();
		ReturnCash returncash = new ReturnCash1();
		
		public DataStore getDataStore(){
			return this.dataStore;
		}

		@Override
		public StoreData getStoreData() {
			// TODO Auto-generated method stub
			return this.storeData;
		}

		@Override
		public DisplayMenu getDisplayMenu() {
			// TODO Auto-generated method stub
			return this.displayMenu;
		}

		@Override
		public PayMsg getPayMsg() {
			// TODO Auto-generated method stub
			return this.payMsg;
		}

		@Override
		public SetPrice getSetPrice() {
			// TODO Auto-generated method stub
			return this.setPrice;
		}

		@Override
		public SetInitialValues getSetInitialValues() {
			// TODO Auto-generated method stub
			return this.setInitVal;
		}

		@Override
		public PumpGasUnit getPumpGasUnit() {
			// TODO Auto-generated method stub
			return this.pumpGasUnit;
		}

		@Override
		public PrintReceipt getPrintReceipt() {
			// TODO Auto-generated method stub
			return this.printReceipt;
		}

		@Override
		public StopMsg getStopMsg() {
			// TODO Auto-generated method stub
			return this.stopMsg;
		}

		@Override
		public RejectMsg getRejectMsg() {
			// TODO Auto-generated method stub
			return this.rejectMsg;
		}

		@Override
		public CancelMsg getCancelMsg() {
			// TODO Auto-generated method stub
			return this.cancelMsg;
		}

		@Override
		public ReadyMsg getReadyMsg() {
			// TODO Auto-generated method stub
			return this.readyMsg;
		}

		@Override
		public GasPumpedMsg getGasPumpedMsg() {
			// TODO Auto-generated method stub
			return this.gasPumpedMsg;
		}

		@Override
		public StoreCash getStoreCash() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ReturnCash getReturnCash() {
			// TODO Auto-generated method stub
			return this.returncash;
		}
	

}
