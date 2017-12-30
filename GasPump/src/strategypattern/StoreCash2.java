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
public class StoreCash2 extends StoreCash{

	@Override
	public void StoreCash(DataStore ds) {
		System.out.println("Entered Cash: " + ((DataStore2)ds).getCash());
		// TODO Auto-generated method stub
		
	}

}
