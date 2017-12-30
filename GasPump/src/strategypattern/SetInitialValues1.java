package strategypattern;

import datastore.DataStore1;
import datastore.DataStore;

/**
 * @author shraddha
 *
 */

public class SetInitialValues1 extends SetInitialValues {
	
	
	public void SetInitialValues(DataStore ds){
		((DataStore1)ds).set_g(0);
		((DataStore1)ds).set_total(0);
	}

}
