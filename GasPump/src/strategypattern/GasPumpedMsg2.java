package strategypattern;

import datastore.DataStore;
import datastore.DataStore1;
import datastore.DataStore2;

/**
 * @author shraddha
 *
 */

	public class GasPumpedMsg2 extends GasPumpedMsg {
		public void GasPumpedMsg(DataStore ds){
			System.out.println(((DataStore2)ds).get_L() + " liter(s) Pumped.");
		}

}
