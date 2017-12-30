/**
 * 
 */
package strategypattern;

import datastore.DataStore;
import datastore.DataStore2;

/**
 * @author shraddha
 *
 */
public class SetInitialValues2 extends SetInitialValues {

	/* (non-Javadoc)
	 * @see strategypattern.SetInitialValues#SetInitialValues(datastore.DataStore)
	 */
	@Override
	public void SetInitialValues(DataStore ds) {
		// TODO Auto-generated method stub

	}

	public void SetInitialValues2(DataStore ds){
		((DataStore2)ds).set_L(0);
		((DataStore2)ds).set_total(0);;
	}
}
