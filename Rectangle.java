//Write a program in JAVA to input a single digit number and print a rectangular form of 4 columns and 6 rows.

import java.util.Scanner;
class Rectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Make a rectangular shape by a single digit number:");
		System.out.println("-------------------------------------");
		System.out.print("Input the number:");
		x = sc.nextInt();
		System.out.println(" " + x + x + x + x);
		System.out.println(" " + x + " " + " " + x);
		System.out.println(" " + x + " " +
		 " " + x);
		System.out.println(" " + x + " " + " " + x);
		System.out.println(" " + x + " " + " " + x);
		System.out.println(" " + x + x + x + x);
	}
}
