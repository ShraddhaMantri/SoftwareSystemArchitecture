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
public class StoreData2 extends StoreData {

	public void StoreData(DataStore ds){
		((DataStore2)ds).seta();
		((DataStore2)ds).setb();
		((DataStore2)ds).setc();
	}
}
