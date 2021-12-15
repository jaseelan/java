package timeConvation;

import java.text.NumberFormat;

public class constantsCanNotChange {

	public static void main(String[] args) {
//		Double result=Math.random();
//		Double results=Math.random()*100;
//		System.out.println(result);
//		System.out.println(results);

//		double result = Math.round(Math.random() * 100);
//		System.out.println(result);

		// NumberFormat currency=NumberFormat.getCurrencyInstance();
		// String result=currency.format(123456.34);
		// System.out.println(result);

		// NumberFormat percent = NumberFormat.getPercentInstance(); or

		String result1 = NumberFormat.getPercentInstance().format(0.5);
		System.out.println(result1);

	}

}
