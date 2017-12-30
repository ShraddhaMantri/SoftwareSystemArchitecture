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
public class ReturnCash2 extends ReturnCash{

	@Override
	public void ReturnCash(DataStore ds) {
		float total = ((DataStore2)ds).get_total() - ((DataStore2)ds).price;
		float balance = ((DataStore2)ds).getCash() - total;
		System.out.println("Returning: $" + balance + " to customer");
	}

	
}
