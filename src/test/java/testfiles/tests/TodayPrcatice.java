package testfiles.tests;

import java.util.Arrays;

public class TodayPrcatice {

	public static void main(String[] args) {
		long[] num = { 1, 2, 3, 4, 5 };

		long sum = Arrays.stream(num).count();

		System.out.println("Sum of elements: " + sum);

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] oddNumbers = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();

		System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
	}

}
