import java.util.Arrays;
import java.util.Date;

public class TimeGetAndArrays {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 6, 8 };
		Arrays.sort(numbers);
		Date da = new Date();
		System.out.println(da);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);

		int[] number = new int[8];
		number[0] = 1;
		number[2] = 3;
		number[6] = 9;
		Arrays.sort(number);
		System.out.println(number);
		System.out.println(Arrays.toString(number));

	}

}
