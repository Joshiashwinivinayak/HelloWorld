//Write a program in JAVA that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Print the multiplication table of a number upto 10:");
		System.out.println("-------------------------------------");
		System.out.print("Input a number:");
		int num1 = in.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
		}
	}
}