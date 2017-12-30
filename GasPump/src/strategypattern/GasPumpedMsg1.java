package strategypattern;

import datastore.DataStore;
import datastore.DataStore1;
import datastore.DataStore2;

/**
 * @author shraddha
 *
 */

public class GasPumpedMsg1 extends GasPumpedMsg {
	public void GasPumpedMsg(DataStore ds){
		System.out.println(((DataStore1)ds).get_g() + " Gallon(s) Pumped.");
	}
}
