package ATM;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class Options extends Accounts {

		int selection;
		Scanner sc=new Scanner(System.in);
		DecimalFormat moneyformat=new DecimalFormat("'$'###,##0.00");
		
		HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
		
		public void getLogin() throws IOException{
			int x=1;
			do {
				try {
					data.put(912345,123);
					data.put(821989,456);
					
					System.out.println("Welcome to ATM!");
					
					System.out.print("Enter Account Number : ");
					setCustomerNumber(sc.nextInt());
					
					System.out.print("Enter Pin : ");
					setPinNumber(sc.nextInt());
				}catch(Exception e) {
					System.out.println("\n" + "Invalid character(s)" + "\n");
					x=2;
				}
				for(Map.Entry<Integer,Integer> entry: data.entrySet()) {
				    if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
				    	getAccountType();
				    }
				}
				System.out.println("\n"+"Wrong Customer Number or Pin Number." +"\n");
				}while(x==1);
			}
				
			public void getAccountType(){
				System.out.println("Select The Account you want to access : ");
				System.out.println("1 - Checking Account");
				System.out.println("2 - Savings Account");
				System.out.println("3 - Exit");
				System.out.print("Choice : ");
				
				selection =sc.nextInt();
				
				switch(selection) {
				case 1:
					getChecking();
					break;
				
				case 2:
					getSavings();
					break;
				
				case 3:
					System.out.println("Thank You for using ATM!");
					break;
			
				default:
					System.out.println("\n"+"Invalid Choice."+"\n");
					getAccountType();
				}
				
			}
			
			public void getChecking() {
				System.out.println("Checking Account : ");
				System.out.println("1 - Balance");
				System.out.println("2 - Withdraw");
				System.out.println("3 - Deposit ");
				System.out.println("4 - Exit");
				System.out.print("Choice : ");
				
				selection = sc.nextInt();
				
				switch(selection) {
				
				case 1:
					System.out.println("Checking Account Balance : "+ moneyformat.format(getCheckingBalance()));
					getAccountType();
					break;
					
				case 2:
					getCheckingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getCheckingDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank You for using ATM!");
					break;
					
				default:
					System.out.println("\n"+"Invalid Choice."+"\n");
					getChecking();
				}
			}
			
			public void getSavings() {
				System.out.println("Saving Account : ");
				System.out.println("1 - Balance");
				System.out.println("2 - Withdraw");
				System.out.println("3 - Deposit ");
				System.out.println("4 - Exit");
				System.out.print("Choice : ");
				
				selection = sc.nextInt();
				
				switch(selection) {
				
				case 1:
					System.out.println("Savings Account Balance : "+ moneyformat.format(getSavingsBalance()));
					getAccountType();
					break;
					
				case 2:
					getSavingsWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getSavingsDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank You for using ATM!");
					break;
					
				default:
					System.out.println("\n"+"Invalid Choice."+"\n");
					getSavings();
				}
			}
	
}

