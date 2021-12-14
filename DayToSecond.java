package timeConvation;

import java.util.Scanner;

public class DayToSecond {

	public static void main(String[] args) {

		Scanner jasee = new Scanner(System.in);

		System.out.println("please enter the days:");

		int days = jasee.nextInt();
		int output = days * 24 * 60 * 60;

		System.out.println(output);
	}

}
