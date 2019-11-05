import java.util.*;



public class Bank {

	public static void main(String args[]) {
		Account[] accounts= new Account[2];
		accounts[0]=new CurrentAccount(35, 100);
		accounts[1]=new SavingsAccounts(0.1,4);
		
		for(int i=0;i<accounts.length;i++) {
			if (accounts[i] instanceof SavingsAccounts) {
		        SavingsAccounts account = (SavingsAccounts) accounts[i];
		        System.out.println(account.interestCalculation());
		    }
			else {
				if (accounts[i] instanceof CurrentAccount) {
					CurrentAccount account = (CurrentAccount) accounts[i];
			        System.out.println(account.getLimit());
		    	
				}
			
			}
	
		}
	
	}	
}