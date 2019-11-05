
public class Bank {
	public Account[] account;
	
	public Bank() {
		this.account = new Account[5];
	}
	
	public void setSavings(double interest) {
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				account[i] = new SavingsAccount(i, interest);
			}
		}
	}
	
	public void setOverdraft(double overdraft) {
		for (int i = 0; i < 5; i++) {
			if (i % 2 != 0) {
				account[i] = new CurrentAccount(i, overdraft);
			}
		}
	}
	
	public void closeAccount(int index) {
		account[index].withdraw(account[index].getBalance());
	}
	
}
