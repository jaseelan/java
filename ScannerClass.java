package timeConvation;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
//	Scanner  scanner=new Scanner (System.in);
//	System.out.print("Age:");
//	byte age=scanner.nextByte();
//	System.out.println("you are: "+age);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Name:");
		String name=scan.nextLine().trim();
		System.out.println("you are :"+name);
	

	}

}
