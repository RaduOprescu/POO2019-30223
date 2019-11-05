import java.util.*;


public class CurrentAccount extends Account {
	
	private double limit; 
	
	public CurrentAccount(double limit, int number ) {
		super(number);
		this.limit=limit;
	}
	
	public double getLimit() {
		return limit;
	}
	
	public void limita(double limit) {
		this.limit=limit;
		
	}
	
	private void overdraft(double limit) {
		if(this.limit>=limit) {
			super.withdraw(limit);
		}
		
	}

}
