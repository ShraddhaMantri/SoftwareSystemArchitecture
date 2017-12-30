/**
 * 
 */
package abstractfactory;

import datastore.DataStore;
import datastore.DataStore2;
import strategypattern.*;


/**
 * @author shraddha
 *
 */
public class ConcreteFactory2 implements AbstractFactory{
	DataStore dataStore = new DataStore2();
	StoreData storeData = new StoreData2();
	DisplayMenu displayMenu = new DisplayMenu2();
	PayMsg payMsg = new PayMsg2();
	SetPrice setPrice = new SetPrice2();
	SetInitialValues setInitVal = new SetInitialValues2();
	PumpGasUnit pumpGasUnit = new PumpGasUnit2();
	PrintReceipt printReceipt = new PrintReceipt2();  //doubt setw
	StopMsg stopMsg = new StopMsg1();
	RejectMsg rejectMsg = new RejectMsg1();
	CancelMsg cancelMsg = new CancelMsg1();
	ReadyMsg readyMsg = new ReadyMsg1();
	StoreCash storeCash = new StoreCash2();
	GasPumpedMsg gasPumpedMsg = new GasPumpedMsg2();
	ReturnCash returnCash = new ReturnCash2();
	

	
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
		return this.storeCash;
	}

	@Override
	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		return this.returnCash;
	}
}
