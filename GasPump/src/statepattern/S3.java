/**
 * 
 */
package statepattern;

/**
 * @author shraddha
 *
 */

//State S3 implements cacellation of request

public class S3 implements State {
	MDAEFSM state = null;

	public S3(MDAEFSM state) {
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
		
	}




	@Override
	public void Reject() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void Cancel() {
		// TODO Auto-generated method stub
		state.op.CancelMsg();
		state.op.ReturnCash();
		state.setState(state.getStateS0());
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
		state.op.SetPrice();
		state.setState(state.getStateS4());
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
