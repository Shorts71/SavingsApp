package application;

public class Transaction {
	String name;
	double transactionAmount;
	Currency[] billTypes;
	public Transaction(String name, double transactionAmount, Currency[] billTypes) {
		this.name = name;
		this.transactionAmount = transactionAmount;
		this.billTypes = billTypes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Currency[] getBillTypes() {
		return billTypes;
	}
	public void setBillTypes(Currency[] billTypes) {
		this.billTypes = billTypes;
	}
}
