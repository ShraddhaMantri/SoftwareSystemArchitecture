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
public class SetPrice2 extends SetPrice {

	public void SetPrice(DataStore ds){
		System.out.println("Gas Pump 2: Gas Price: " + ((DataStore2) ds).price);
	}

}
