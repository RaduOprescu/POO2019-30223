import java.util.*;

public class SavingsAccounts extends Account {
	private double interest;
	
	public SavingsAccounts(double interest, int number) {
		super(number);
		this.interest=interest;
	}
	

	public double interestCalculation() {
		double newBalance= getBalance()*interest + getBalance();
		return newBalance;
	}
	
	public void finalBalance(double interest) {
		double newBalance=super.getBalance()*interest;
		super.deposit(newBalance);
		
	}
	
	
}
