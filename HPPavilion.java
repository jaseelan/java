import java.util.Scanner;

public class HPPavilion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		OS OSObject = new OS();
		System.out.println("Enter name of os:");
		String temp=input.nextLine();
		OSObject.setDetails(temp);
		OSObject.HTC();
	}

}