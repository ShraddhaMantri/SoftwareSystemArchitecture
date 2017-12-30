package gaspump;

import datastore.DataStore;
import datastore.DataStore1;
import statepattern.MDAEFSM;

/**
 * @author shraddha
 *
 */

//Input Class for GasPump1. All the events are described here.

public class GasPump1 {
	MDAEFSM mda = null;
	DataStore ds = null;
	
	public GasPump1(MDAEFSM mda, DataStore ds){
		this.mda = mda;
		this.ds = ds;
	}
	
	public void Activate(float a, float b){
		if(a > 0 && b > 0){
			((DataStore1)ds).a = a;
			((DataStore1)ds).b = b;
		}
		mda.Activate();
	}
	
	public void Start(){
		mda.Start();;
	}
	
	public void PayCredit(){
		mda.PayType(1);
		System.out.println("Waiting for Approval");
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

	public void PumpGallon() {
		mda.PumpGallon();
	}

	public void StopPump() {
		mda.StopPump();
		mda.Receipt();
	}
	
	public void Regular() {
		// TODO Auto-generated method stub
		((DataStore1) ds).set_rPrice();
		System.out.println("Regular Gas is Selected.");
		mda.SelectGas(1);
	}

	public void Super() {
		((DataStore1) ds).set_sPrice();
		System.out.println("Super Gas is Selected");
		mda.SelectGas(2);
	}

	public void Receipt() {
		System.out.println("*******************************");
		mda.Receipt();
		
	}



}
