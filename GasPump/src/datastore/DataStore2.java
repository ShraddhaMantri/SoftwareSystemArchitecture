/**
 * 
 */
package datastore;

/**
 * @author shraddha
 *
 */

//This class stores data of GasPump2

public class DataStore2 extends DataStore{
	public int a; //Temporary variable for Regular gas price
	public int b; //Temporary variable for Super gas price
	public int c; //Temporary variable for Premium gas price
	public float cash; //variable to store cash amount
	public float temp_cash; // temporary variable to store cash
	public int L; //variable for number of liters of gas
	public float total; //store total amount
	public int rPrice; //variable for Regular gas price
	public int sPrice; //variable for Super gas price
	public int pPrice; //variable for Premium gas price						/////doubt about set w
	public int price; //variable for gas price depending on the selection
	
	public void seta(){
		this.rPrice = a;
	}
	
	public void setb(){
		this.sPrice = b;
	}
	
	public void setc(){
		this.pPrice = c;
	}
	
	public void set_rPrice(){
		this.price = a;
	}
	
	public void set_sPrice(){
		this.price = b;
	}
	
	public void set_pPrice(){
		this.price = c;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public int get_L(){
		this.L = this.L + 1;
		return this.L;
	}
	
	public void set_L(int L){
		this.L = L;
	}

	public float get_total(){
		return total = this.price * this.L;
	}
	
	public void set_total(float total){
		this.total = total;
	}
	
	public float getCash(){
		return this.cash;
	}
	
	public void setCash(float cash){
		this.cash = this.temp_cash;
	}
}
