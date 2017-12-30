package strategypattern;

import datastore.DataStore;
import datastore.DataStore1;

/**
 * @author shraddha
 *
 */

public class SetPrice1 extends SetPrice {

	public void SetPrice(DataStore ds){
		System.out.println("Gas Pump 1: Gas Price: " + ((DataStore1) ds).getPrice());
	}

}
