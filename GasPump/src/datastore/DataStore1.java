package datastore;

/**
 * @author shraddha
 *
 */

//This class store data of GasPump1

public class DataStore1 extends DataStore{
		// TODO Auto-generated method stub
		public float a;//Temporary variable for regular gas price
		public float b; //Temporary variable for super gas price
		public float rPrice; //Variable for regular gas price
		public float sPrice; //Variable for super gas price
		public int g; //variable for number of gallons of gas
		public float price; //variable set according to selection of gas
		public float total; //store total amount
		
		public void seta(){
			this.rPrice = a;
		}
		
		public void setb(){
			this.sPrice = b;
		}
		
		public void set_rPrice(){
			this.price = a;
		}
		
		public void set_sPrice(){
			this.price = b;
		}
		
		public float getPrice(){
			return this.price;
		}
		
		public int get_g(){
			 this.g = this.g + 1;
			 return this.g;
		}
		
		public void set_g(int g){
			this.g = g;
		}

		public float get_total(){
			return total = price * g;
		}
		
		public void set_total(float total){
			this.total = total;
		}
		
}
