/**
 * 
 */
package statepattern;

/**
 * @author shraddha
 *
 */

// Start state implements activation of gas pump
public class Start implements State{

	MDAEFSM state = null;
	
	public Start(MDAEFSM m){
		this.state = m;
	}
	
	@Override
	public void Activate() {
		state.op.StoreData();
		state.setState(state.getStateS0());
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		
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
