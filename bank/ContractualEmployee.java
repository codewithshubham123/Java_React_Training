package com.assignments.bank;

public class ContractualEmployee extends Employee {

	private int dailyWage;
	private int periodOfContract;

	public ContractualEmployee(int id, String ename, String department, String email, int dailyWage,
			int periodOfContract) {
		super(id, ename, department, email);
		this.dailyWage = dailyWage;
		this.periodOfContract = periodOfContract;
	}

	public int getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}

	public int getPeriodOfContract() {
		return periodOfContract;
	}

	public void setPeriodOfContract(int periodOfContract) {
		this.periodOfContract = periodOfContract;
	}

	@Override
	public String toString() {
		return "ContractualEmployee [dailyWage=" + dailyWage + ", periodOfContract=" + periodOfContract + ", getId()="
				+ getId() + ", getEname()=" + getEname() + ", getDepartment()=" + getDepartment() + ", getEmail()="
				+ getEmail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

}
