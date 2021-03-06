/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: User enters a number the program calculates and prints 
 *  sum of right most 4 digits.
 * Latest version: 10:32 PM, 7/1/2017
 * Older versions: 
 */

import java.util.Scanner;

public class SumOfDigits

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number;
		int sumOfDigits;

		System.out.print("Enter a 4 digit number to find sum of its digits: ");
		number = input.nextInt();

		sumOfDigits = sumOfDigits(number);
		System.out.printf("Number: %d, Sum of digits: %d%n", number, sumOfDigits);
	}

	public static int sumOfDigits(int number)
	{
		int sumOfDigits = 0;

		for (int counter = 1; counter <= 4; counter++)
		{
			sumOfDigits += number % 10;
			number /= 10;
		}
		return sumOfDigits;
	}
}
