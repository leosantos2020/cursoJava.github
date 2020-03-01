package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		Produto account;
		System.out.print("enter account number: ");
		int number=sc.nextInt();
		System.out.print("enter account holder: ");
		sc.nextLine();
		String holder=sc.nextLine();
		System.out.print("Is there an initial deposit (y/n) ? ");
		char response=sc.next().charAt(0);
		if(response=='y') {
			System.out.println("initial deposit value: ");
			double initialDeposit=sc.nextDouble();
			account=new Produto(number,holder,initialDeposit);
		}else {
			account=new Produto(number,holder);
		}
		System.out.println();
		System.out.println("account data:");
		System.out.println(account.toString());
		System.out.println();
		System.out.print("enter a deposit value:");
		double depValue=sc.nextDouble();
		account.deposit(depValue);
		System.out.println("updated account data:");
		System.out.println(account.toString());
		System.out.print("enter a withdraw value:");
		double withdrawValue=sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("updated account data:");
		System.out.println(account.toString());
		
		sc.close();
	}

}
