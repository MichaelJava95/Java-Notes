/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Inputs and displays student grades.
 * Latest version: 3:34 AM, 6/9/2016.
 * Older versions: 1:21 PM, 9/6/2016
 */

import java.util.Scanner;

public class StudentGrades
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String studentName;
		String studentGrade;
		int ACounter = 0;
		int BCounter = 0;
		int CCounter = 0;
		int DCounter = 0;
		int FCounter = 0;

		for (int counter = 1; counter <= 5; counter++)
		{
			System.out.print("Enter student name: ");
			studentName = input.nextLine();
 
			System.out.print("Enter student grade(A-F): ");
			studentGrade = input.nextLine();
			switch (studentGrade)
			{
				case "A":
					++ACounter;
					break;
				case "B":
					++BCounter;
					break;
				case "C":
					++CCounter;
					break;
				case "D":
					++DCounter;
					break;
				case "F":
					++FCounter;
					break;
			}
		}

		System.out.printf("%nA: %d%nB: %d%nC: %d%nD: %d%nF: %d%n", ACounter, BCounter,
			 CCounter, DCounter, FCounter);
	}
}
