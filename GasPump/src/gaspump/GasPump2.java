/**
 * 
 */
package gaspump;

import datastore.DataStore;
import datastore.DataStore2;
import statepattern.MDAEFSM;

/**
 * @author shraddha
 *
 */

//Input Class for GasPump2. All the events for Gas Pump2 are described here.

public class GasPump2 {
	MDAEFSM mda = null;
	DataStore ds = null;
	
	public GasPump2(MDAEFSM mda, DataStore ds){
		this.mda = mda;
		this.ds = ds;
	}
	
	public void Activate(int a, int b, int c){
		if(a > 0 && b > 0){
			((DataStore2)ds).a = a;
			((DataStore2)ds).b = b;
			((DataStore2)ds).c = c;
		}
		mda.Activate();
	}
	
	public void Start(){
		mda.Start();;
	}
	
	public void PayCash(float cash){
		if (cash > 0) {
			((DataStore2) ds).cash = cash;
			mda.PayType(2);
		}
	}

	public void Reject() {
		mda.Reject();
	}

	public void Cancel() {
		mda.Cancel();
	}

	public void Approved() {
		mda.Approved();
	}

	public void StartPump() {
		mda.StartPump();
	}

	public void PumpLiter() {
		if(((DataStore2)ds).cash < (((((DataStore2)ds).L) + 1) * ((DataStore2)ds).price) ){
			mda.StopPump();
		}
		else
			mda.PumpLiter();
	}

	public void StopPump() {
		mda.StopPump();
		//mda.Receipt();
	}
	
	public void Regular() {
		// TODO Auto-generated method stub
		((DataStore2) ds).set_rPrice();
		System.out.println("Regular Gas is selected.");
		mda.SelectGas(1);
	}

	public void Super() {
		((DataStore2) ds).set_sPrice();
		System.out.println("Super Gas is selected.");
		mda.SelectGas(2);
	}
	
	public void Premium(){
		((DataStore2) ds).set_pPrice();
		System.out.println("Premium Gas is selected.");
		mda.SelectGas(3);
	}

	public void Receipt() {
		// TODO Auto-generated method stub
		mda.Receipt();
		
	}

	public void NoReceipt() {
		// TODO Auto-generated method stub
		mda.NoReceipt();
	}

}
