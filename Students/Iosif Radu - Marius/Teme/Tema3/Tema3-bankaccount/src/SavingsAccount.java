
public class SavingsAccount extends Account {
	
	public double interest;
	
	public SavingsAccount(int number, double interest) {
		super(number);
		this.interest = interest;
	}
	
	public void setInterest(double newInterest) {
		this.interest = newInterest;
	}
	
	public double getInterest() {
		return this.interest;
	}
	
	public void deposit() {
		super.deposit(this.interest);
	}

}
