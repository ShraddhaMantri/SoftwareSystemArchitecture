package strategypattern;

import datastore.DataStore;
import datastore.DataStore1;

/**
 * @author shraddha
 *
 */

public class PrintReceipt1 extends PrintReceipt {
	public void PrintReceipt(DataStore ds){
		int gallons = ((DataStore1)ds).get_g()- 1;
		float total = ((DataStore1)ds).get_total() - ((DataStore1)ds).price;
		System.out.println("Receipt: Gas Pump 1");
		System.out.println("Gas Pumped: " + gallons + "Gallon(s)");
		System.out.println("Total Amount: $" + total);
	}

}
