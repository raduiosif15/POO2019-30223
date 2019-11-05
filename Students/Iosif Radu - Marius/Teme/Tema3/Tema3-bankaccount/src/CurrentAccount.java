
public class CurrentAccount extends Account {

	public double overdraft;

	public CurrentAccount(int number, double overdraft) {
		super(number);
		this.overdraft = overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return this.overdraft;
	}

	public void withdraw(double sum) {
		double partialBalance = super.getBalance();
		if (partialBalance - sum > this.overdraft) {
			super.withdraw(sum);
		} else {
			System.out.println("CurrentAccount.withdraw(...): cannot withdraw this amount.");
		}
	}

}
