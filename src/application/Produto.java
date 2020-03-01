package application;

public class Produto {
	private final int account;
	private String holder;
	private double balance;
	public Produto(int account, String holder) {
		super();
		this.account = account;
		this.holder = holder;
	}
	public Produto(int account, String holder, double initialDeposit) {
		super();
		this.account = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public int getAccount() {
		return account;
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public void withdraw(double amount) {
		this.balance-= amount+5.0;
	}
	public String toString() {
		return "account: "
				+account
				+", "
				+"holder: "
				+ holder
				+", "
				+"balance: $ "
				+String.format("%.2f",balance);
	}
	}
