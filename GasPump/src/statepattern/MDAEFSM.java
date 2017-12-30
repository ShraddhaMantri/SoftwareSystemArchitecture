package statepattern;

import abstractfactory.AbstractFactory;
import output.Output;

/**
 * @author shraddha
 *
 */

//This is Context class for state pattern implementation

public class MDAEFSM {	
	State s = new Start(this);
	State s0 = new S0(this);
	State s1 = new S1(this);
	State s2 = new S2(this);
	State s3 = new S3(this);
	State s4 = new S4(this);
	State s5 = new S5(this);
	State s6 = new S6(this);
	
	AbstractFactory af = null;
	Output op = null;
	State state = null;
	
	public MDAEFSM(Output op){
		state = s;
		this.af = af;
		this.op = op;
	}
	
	public void Activate(){
		state.Activate();
		printCurrState();
	}
	
	public void Start(){
		state.Start();
		printCurrState();
	}
	
	public void PayType(int t){
		if(t == 1)
			state.PayCredit();
		else if(t == 2)
			state.PayCash();
		printCurrState();
	}
	
	public void PayCash(){
		state.PayCash();
		printCurrState();
	}
	
	public void Reject(){
		state.Reject();
		printCurrState();
	}
	
	public void Cancel(){
		state.Cancel();
		printCurrState();
	}
	
	public void Approved(){
		state.Approved();
		printCurrState();
	}
	
	public void SelectGas(int g){
		state.SelectGas(g);
		printCurrState();
	}
	
	public void StartPump(){
		state.StartPump();
		printCurrState();
	}
	
	public void PumpGallon(){
		state.PumpGallon();
		printCurrState();
	}
	
	public void PumpLiter(){
		state.PumpLiter();
		printCurrState();
	}
	
	public void StopPump(){
		state.StopPump();
		printCurrState();
	}
	
	public void Receipt(){
		state.Receipt();
		printCurrState();
	}
	
	public void NoReceipt(){
		state.NoReceipt();
		printCurrState();
	}

	
	public void setState(State state){
		this.state = state;
	}
	
	public State getStateStart(){
		return s;
	}
	
	public State getStateS0(){
		return s0;
	}
	
	public State getStateS1(){
		return s1;
	}
	
	public State getStateS2(){
		return s2;
	}
	
	public State getStateS3(){
		return s3;
	}
	
	public State getStateS4(){
		return s4;
	}
	
	public State getStateS5(){
		return s5;
	}
	
	public State getStateS6(){
		return s6;
	}
	
	public void printCurrState(){
		System.out.println("Current State: " + state.getClass().getName());
	}
}
