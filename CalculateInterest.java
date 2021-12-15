package timeConvation;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {
		final byte MONTH_IN_YEAR = 12;
		final byte PERCENT = 100;
		int principal = 0;
		float monthlyInterest = 0;
		int numberofPayment = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Principal:");
			principal = scanner.nextInt();
			if (principal >= 1000 && principal <= 1_000_000)
				break;
			System.out.println("Enter value between 1000 to 1_000_000");
		}

		while (true) {
			System.out.print("Annual Interest Rate:");
			float annualInterest = scanner.nextFloat();
			if (annualInterest >= 1 && annualInterest <= 30) {
				monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
				break;
			}
			System.out.println("Enter value between 1 to 30:");
		}
		while (true) {
			System.out.print("Period (Years):");
			byte years = scanner.nextByte();
			if (years >= 1 && years <= 30) {
				numberofPayment = years * MONTH_IN_YEAR;
				break;
			}
			System.out.println("Enter the valude yeat between 1 to 30");
		}
		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberofPayment))
				/ (Math.pow(1 + monthlyInterest, numberofPayment));
//	String mortgageFormatted = NumberFormat.getCurrencyInstance();
		System.out.println("Mortgage:" + mortgage);

	}

}
