/**
 * 
 */
package strategypattern;

import datastore.DataStore;
import datastore.DataStore1;
import datastore.DataStore2;

/**
 * @author shraddha
 *
 */
public class PrintReceipt2 extends PrintReceipt {


	
	public void PrintReceipt(DataStore ds){
		int liters = ((DataStore2)ds).get_L() - 1;
		float total = ((DataStore2)ds).get_total() - ((DataStore2)ds).price;
		System.out.println("Receipt: Gas Pump 2");
		System.out.println("Gas Pumped: " + liters + " Liter(s)");
		System.out.println("Total Amount: $" + total);
	}

}
