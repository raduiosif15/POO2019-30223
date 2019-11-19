package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public class Employee {
	public String name;
	public Long id;
	public BigDecimal salary;
	public boolean isDead;
	
	public Employee() {
		this.isDead = false;
		this.salary = new BigDecimal(2000);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId() {
		Long randomId = (long) (Math.random() * 10000000 * 1000000);
		this.id = randomId;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public boolean getIsDead() {
		return this.isDead;
	}
}
