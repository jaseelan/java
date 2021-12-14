package timeConvation;

import java.util.Arrays;
import java.util.Date;

public class MultiDymentionArrays {

	public static void main(String[] args) {
		Date da = new Date();
		System.out.println(da);
		int[][] numbers = new int[2][3];
		int[][] number = { { 1, 2, 5, 6 }, { 0, 1, 5, 9, 2 } };
		numbers[0][0] = 1;
		System.out.println(Arrays.deepToString(number));
		System.out.println(Arrays.deepToString(numbers));
	}

}
