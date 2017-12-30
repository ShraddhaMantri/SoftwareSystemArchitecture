/**
 * 
 */
package statepattern;

/**
 * @author shraddha
 *
 */

// State S1 implements PayCredit or PayCash depending on PaYType option

public class S1 implements State {

	MDAEFSM state = null;

	public S1(MDAEFSM state) {
		this.state = state;
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
	}

	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub
		state.setState(state.getStateS2());
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
		state.op.StoreCash();
		state.op.DisplayMenu();
		state.setState(state.getStateS3());
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
