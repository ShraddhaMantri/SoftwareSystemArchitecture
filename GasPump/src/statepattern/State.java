/**
 * 
 */
package statepattern;

/**
 * @author shraddha
 *
 */
public interface State {
	public void Activate();
	public void Start();
	public void PayCredit();
	public void Reject();
	public void Cancel();
	public void Approved();
	public void StartPump();
	public void PumpGallon();
	public void StopPump();
	public void Receipt();
	public void SelectGas(int g);
	public void PayCash();
	public void NoReceipt();
	public void PumpLiter();
}
