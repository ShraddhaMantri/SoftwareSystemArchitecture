/**
 * 
 */
package statepattern;


/**
 * @author shraddha
 *
 */

// State S0 which implements start action

public class S0 implements State {
	
	MDAEFSM state = null;

	public S0(MDAEFSM state) {
		this.state = state;
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		state.op.PayMsg();
		state.setState(state.getStateS1());
		
	}

	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Reject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StartPump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PumpGallon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PayCash() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PumpLiter() {
		// TODO Auto-generated method stub
		
	}



	
}
