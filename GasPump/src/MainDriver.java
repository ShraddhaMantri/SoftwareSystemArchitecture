import java.util.InputMismatchException;
import java.util.Scanner;

import abstractfactory.ConcreteFactory1;
import abstractfactory.ConcreteFactory2;
import gaspump.GasPump1;
import gaspump.GasPump2;
import output.Output;
import statepattern.MDAEFSM;
import statepattern.State;

/**
 * @author shraddha
 *
 */

//Main Class

public class MainDriver{

	public static void main(String[] args){
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int input;
			int ch = 0;
			System.out.println("Select GasPump: ");
			System.out.println("1. GasPump1");
			System.out.println("2. GasPump2");
			input = scan.nextInt();
		
			if(input == 1){					//Gas Pump 1
				//Create required objects
				ConcreteFactory1 cf1 = new ConcreteFactory1();
				Output op = new Output(cf1, cf1.getDataStore());
				MDAEFSM mda = new MDAEFSM(op);
				GasPump1 gp1 = new GasPump1(mda, cf1.getDataStore());
			
				float a, b;
				//Menu of Operations for GasPump1
				System.out.println("          Gas Pump-1 Selected \n");
				System.out.println("          MENU of Operations");
				System.out.println("          0. Activate");
				System.out.println("          1. Start");
				System.out.println("          2. PayCredit");
				System.out.println("          3. Reject");
				System.out.println("          4. Cancel");
				System.out.println("          5. Approved");
				System.out.println("          6. Regular");
				System.out.println("          7. Super");
				System.out.println("          8. StartPump");
				System.out.println("          9. PumpGallon");
				System.out.println("          10. StopPump");
				System.out.println("          99. Quit the Program");
				
				while(true){

					if(ch != 5){
						System.out.println("Select Operation: ");
						System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved, 8-StartPump, 9-PumpGallon, 10-StopPump, 99-Exit");
					}
					
					try{
						input = scan.nextInt();
					}
					catch(InputMismatchException ex){
						System.out.println("Invalid Input! Please choose a valid option");
						continue;
					}
					
					if (input == 99){ //Exit
						System.out.println("Exit");
						break;
					}
					
					ch = input;
					switch(ch){
					case 0: //Activate
						System.out.println("Operation: Activate ");
						System.out.println("Enter the price of Regular gas: ");
						a = scan.nextFloat();
						System.out.println("Enter the price of Super gas: ");
						b = scan.nextFloat();
						gp1.Activate(a, b);
						break;
						
					case 1: //Start
						System.out.println("Operation: Start");
						gp1.Start();
						break;
						
					case 2: //PayCredit
						System.out.println("Operation: PayCredit");
						gp1.PayCredit();
						break;
						
					case 3: //Reject
						System.out.println("Operation: Reject");
						gp1.Reject();
						break;
						
					case 4: //Cancel
						System.out.println("Operation: Cancel");
						gp1.Cancel();
						break;
						
					case 5: //Approved
						System.out.println("Operation: Approved");
						gp1.Approved();
						break;
						
					case 6: //Gas Type: Regular
						System.out.println("Operation: Regular");
						gp1.Regular();
						break;
						
					case 7: //Gas Type: Super
						System.out.println("Operation: Super");
						gp1.Super();
						break;
						
					case 8: //StartPump
						System.out.println("Operation: StartPump");
						gp1.StartPump();
						break;
						
					case 9: //PumpGallon
						System.out.println("Operation: PumpGallon");
						gp1.PumpGallon();
						break;
						
					case 10: //StopPump
						System.out.println("Operation: StopPump");
						gp1.StopPump();
						break;
						
					case 11: //Receipt
						System.out.println("Operation: Receipt");
						gp1.Receipt();
						break;
			
						
					default: //Invalid Choice
						System.out.println("Invalid choice");
						break;
					}
				}
			}
			
			
			else if(input == 2){ 			//GasPump2
				//Create required objects
				ConcreteFactory2 cf2 = new ConcreteFactory2();
				Output op = new Output(cf2, cf2.getDataStore());
				MDAEFSM mda = new MDAEFSM(op);
				GasPump2 gp2 = new GasPump2(mda, cf2.getDataStore());
				
				//Menu of operations for GasPump2
				int a, b, c;
				System.out.println("          Gas Pump-2 Selected");
				System.out.println("          MENU of Operations");
				System.out.println("          0. Activate(int)");
				System.out.println("          1. Start");
				System.out.println("          2. PayCash");
				System.out.println("          3. Reject");
				System.out.println("          4. Cancel");
				System.out.println("          5. Approved");
				System.out.println("          9. StartPump");
				System.out.println("          10. PumpLiter");
				System.out.println("          11. StopPump");
				System.out.println("          12. Receipt");
				System.out.println("          13. NoReceipt");
				System.out.println("          99. Quit the Program");
				
				while(true){
					System.out.println("Select Operation: ");
					System.out.println("0-Activate, 1-Start, 2-PayCash, 3-Reject, 4-Cancel, 8-StartPump, 9-PumpLiter, 10-StopPump, 11-PrintReceipt, 12-NoReceipt, 99-Exit");
					try{
						input = scan.nextInt();
					}
					catch(InputMismatchException ex){
						System.out.println("Invalid Input! Please choose one of the above options");
						continue;
					}
					
					if (input == 99){	//Exit
						System.out.println("Exit");
						break;
					}
					
					ch = input;
					switch(ch){
					case 0: //Activate
						System.out.println("Activate: ");
						System.out.println("Enter the price of Regular gas: ");
						a = scan.nextInt();
						System.out.println("Enter the price of Super gas: ");
						b = scan.nextInt();
						System.out.println("Enter the price of Premium gas: ");
						c = scan.nextInt();
						gp2.Activate(a, b, c);
						break;
						
					case 1: //Start
						System.out.println("Operation: Start");
						gp2.Start();
						break;
						
					case 2: //PayCash
						System.out.println("Operation: PayCash");
						System.out.println("Enter Cash:");
						float cash = scan.nextFloat();
						gp2.PayCash(cash);
						break;
						
					case 3: //Reject
						System.out.println("Operation: Reject");
						gp2.Reject();
						break;
						
					case 4: //Cancel
						System.out.println("Operation: Cancel");
						gp2.Cancel();
						break;
						
					case 5: //Gas Type: Regular
						System.out.println("Operation: Regular");
						gp2.Regular();
						break;
						
					case 6: //Gas Type: Super
						System.out.println("Operation: Super");
						gp2.Super();
						break;
						
					case 7: //Gas Type: Premium
						System.out.println("Operation: Premium");
						gp2.Premium();
						break;
						
					case 8: //StartPump
						System.out.println("Operation: StartPump");
						gp2.StartPump();
						break;
						
					case 9: //PumpLiter
						System.out.println("Operation: PumpLiter");
						gp2.PumpLiter();
						break;
						
					case 10: //StopPump
						System.out.println("Operation: StopPump");
						gp2.StopPump();
						break;
						
					case 11: //Receipt
						System.out.println("Operation: Receipt");
						gp2.Receipt();
						break;
						
					case 12: //NoReceipt
						System.out.println("Operation: NoReceipt");
						gp2.NoReceipt();
						
					default: //Invalid Choice
						System.out.println("Invalid choice");
						break;
					}
				}

			}
	}

}
