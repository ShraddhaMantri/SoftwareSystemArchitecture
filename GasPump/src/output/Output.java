package output;

import abstractfactory.*;
import strategypattern.*;
import datastore.DataStore;

/**
 * @author shraddha
 *
 */

//This is output class. All actions are described here.
//Output class associates with abstract factory, datastore and strategy classes.

public class Output {
	AbstractFactory af = null;
	DataStore ds = null;
	
	public Output(AbstractFactory af, DataStore ds){
		this.af = af;
		this.ds = ds;
	}
	
	public void StoreData(){
		StoreData storeData = af.getStoreData();
		storeData.StoreData(ds);
	}
	
	public void DisplayMenu(){
		DisplayMenu dispMenu = af.getDisplayMenu();
		dispMenu.DisplayMenu();
	}
	
	public void PayMsg(){
		PayMsg payMsg = af.getPayMsg();
		payMsg.PayMsg();
	}
	
	public void SetPrice(){
		SetPrice setPrice = af.getSetPrice();
		setPrice.SetPrice(ds);
	}
	
	public void SetInitialValues(){
		SetInitialValues setInitVal = af.getSetInitialValues();
		setInitVal.SetInitialValues(ds);
	}
	
	public void PumpGasUnit(){
		PumpGasUnit pumpGasUnit = af.getPumpGasUnit();
		pumpGasUnit.PumpGasUnit();
	}
	
	public void PrintReceipt(){
		PrintReceipt printReceipt = af.getPrintReceipt();
		printReceipt.PrintReceipt(ds);
	}
	
	public void StopMsg(){
		StopMsg stopMsg = af.getStopMsg();
		stopMsg.StopMsg();
	}
	
	public void RejectMsg(){
		RejectMsg rejectMsg = af.getRejectMsg();
		rejectMsg.RejectMsg();
	}
	
	public void CancelMsg(){
		CancelMsg cancelMsg = af.getCancelMsg();
		cancelMsg.CancelMsg();
	}
	
	public void ReadyMsg(){
		ReadyMsg readyMsg = af.getReadyMsg();
		readyMsg.ReadyMsg();
	}
	
	public void GasPumpedMsg(){
		GasPumpedMsg gasPumpedMsg = af.getGasPumpedMsg();
		gasPumpedMsg.GasPumpedMsg(ds);
	}
	
	public void StoreCash(){
		StoreCash storeCash = af.getStoreCash();
		storeCash.StoreCash(ds);
	}

	public void ReturnCash() {
		ReturnCash returnCash = af.getReturnCash();
		returnCash.ReturnCash(ds);
	}

		
}
