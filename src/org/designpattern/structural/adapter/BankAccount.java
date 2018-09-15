package org.designpattern.structural.adapter;

public class BankAccount {

	int accNumber;
	String name;
	String accType;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", name=" + name + ", accType=" + accType + "]";
	}
}
