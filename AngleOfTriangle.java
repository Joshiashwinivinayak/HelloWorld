//Write a program in JAVA to find the third angle of a triangle. 
//Sample Output:
//Find the third angle of a triangle :
//----------------------------------------------------------------
//Input the 1st angle of the triangle : 30
//Input the 2nd angle of the triangle : 60
//The 3rd of the triangle is : 90

import java.util.Scanner;
public class AngleOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the third angle of a triangle:");
		System.out.println("-------------------------------------");
		System.out.println("Input  the 1st angle of the triangle:");
		int a = sc.nextInt();
		System.out.println("Input the 2nd angle of the triangle:");
		int b = sc.nextInt();
		int c;
		c = 180 - (a + b);
		System.out.println("The 3rd  angle of the triangle is:" + c);
	}
}