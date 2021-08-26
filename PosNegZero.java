//Write a program in JAVA to check whether a number is positive, negative or zero.
//Sample Output:
//Check whether a number is positive, negative or zero :
//---------------------------------------------------------------
//Input a number : 8
//The entered number is positive.


import java.util.Scanner;
class PosNegZero {
	public static void main(String []s) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Check whether a number is positive, negative or zero:");
		System.out.println("-------------------------------------");
		System.out.print("Input a number:");
		num = sc.nextInt();
		if (num > 0)
			System.out.println("The Enterd Number is Positive.");
		else if (num < 0)
			System.out.println("The Enterd Number is Negative.");
		else
			System.out.println("The Enterd Number is  Zero");

	}
}