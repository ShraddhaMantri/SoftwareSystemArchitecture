package strategypattern;

/**
 * @author shraddha
 *
 */

import datastore.DataStore;
import datastore.DataStore1;

public class StoreData1 extends StoreData{
	
	public void StoreData(DataStore ds){
		((DataStore1)ds).seta();
		((DataStore1)ds).setb();
	}
}
