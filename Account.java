import java.util.Scanner;

public class Account {
	Scanner scan = new Scanner(System.in);
	private int accountNumber;
	private double accountBalance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = 2000;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double depositFunds() {
		System.out.println("Enter the money you deposit.");
		double deposit = scan.nextDouble();
		accountBalance += deposit;
		System.out.println("New balance is : " + getAccountBalance());
		return accountBalance;
	}
	
	public double withdrawFunds() {
		System.out.println("Enter the money you would like to withdraw: ");
		double withdrawal = scan.nextDouble();
		if(accountBalance - withdrawal < 0) {
			System.out.println("Can not withdraw.");
			return -1;
		}
		accountBalance -= withdrawal;
		System.out.println("Remaining balance is : " + getAccountBalance());
		return accountBalance;
	}
}
