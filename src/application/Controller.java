package application;

import java.util.List;

public class Controller {
	boolean registered;
	int pin;
	double totalAmount;
	List<Transaction> transactionList;
	
	private Controller(boolean registered, int pin, double totalAmount, List<Transaction> transactionList) {
		this.registered = registered;
		this.pin = pin;
		this.totalAmount = totalAmount;
		this.transactionList = transactionList;
	}
	
	public void EnterPIN(int pin) {
		
	}

	public void withdraw(double totalAmount, double withdrawAmount, List<Transaction> transactionList) {
		
	}
	
	public void deposit(double totalAmount, double depositAmount, List<Transaction> transactionList) {
		
	}
	
	public void viewTransactionHistory(List<Transaction> transactionList) {
		
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	

	
	
}
