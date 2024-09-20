package ATM;
import java.text.*;
import java.util.*;
public class Accounts {
	private int customerNumber,pinNumber;
	private double checkingBalance=0,savingsBalance=0;
	Scanner sc= new Scanner(System.in);
	DecimalFormat moneyformat =new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber(){
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber(){
		return pinNumber;
	
}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
	return savingsBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingsWithdraw(double amount) {
		savingsBalance = (savingsBalance - amount);
		return savingsBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calcSavingsDeposit(double amount) {
		savingsBalance = (savingsBalance + amount);
		return savingsBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance : " + moneyformat.format(checkingBalance));
		System.out.print("Withdraw Amount :");
		double amount = sc.nextDouble();
		
		if((checkingBalance - amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("Checking Account Balance : "+ moneyformat.format(checkingBalance));
		}else {
			System.out.println("Low Balance"+ "\n");
		}
	}
	
	public void getSavingsWithdrawInput() {
		System.out.println("Savings AccountBalance : " + moneyformat.format(savingsBalance));
		System.out.print("Withdraw Amount :");
		double amount = sc.nextDouble();
		
		if((savingsBalance - amount)>=0){
			calcSavingsWithdraw(amount);
			System.out.println("Savings Account Balance : "+ moneyformat.format(savingsBalance));
		}else {
			System.out.println("Low Balance"+ "\n");
		}
	}
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance : " + moneyformat.format(checkingBalance));
		System.out.print("Deposit Amount :");
		double amount = sc.nextDouble();
		
		if((checkingBalance + amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("Checking Account Balance : "+ moneyformat.format(checkingBalance));
		}else {
			System.out.println("Low Balance"+ "\n");
		}
	}
	
	public void getSavingsDepositInput() {
		System.out.println("Savings AccountBalance : " + moneyformat.format(savingsBalance));
		System.out.print("DepositAmount :");
		double amount = sc.nextDouble();
		
		if((savingsBalance + amount)>=0){
			calcSavingsDeposit(amount);
			System.out.println("Savings Account Balance : "+ moneyformat.format(savingsBalance));
		}else {
			System.out.println("Low Balance"+ "\n");
		}
	}
	
	}


