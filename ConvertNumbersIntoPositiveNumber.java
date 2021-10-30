package week1.day1;

public class ConvertNumbersIntoPositiveNumber {

	public static void main(String[] args) {
		// Convert a negative number to positive number
		// Sample Ouput:: "The number -40 is converted to 40"
		int n = -3;
		System.out.println("Convert Negative numbers into Positive numbers");
		if (n < 0) {
			int x = (~(n - 1));
			System.out.printf("The number %d is converted to %d ", n, x);
		} else {
			System.out.println("The number is already positive number " + n);
		}
	}

}
