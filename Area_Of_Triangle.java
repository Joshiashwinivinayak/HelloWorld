//Write a program in JAVA to find the area of any triangle using Heron's Formula. 
//Sample Output:
//Find the area of any triangle using Heron's Formula :
//----------------------------------------------------------
//Input the length of 1st side of the triangle : 5
//Input the length of 2nd side of the triangle : 6
//Input the length of 3rd side of the triangle : 7
//The area of the triangle is : 14.6969

import java.util.Scanner;
public class Area_Of_Triangle {
	public static void main(String[] args) {
		double s1, s2, s3, area, S;
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the area of any triangle using Heron's Formula:");
		System.out.println("-------------------------------------");
		System.out.print("Input  length of 1st Side of a Triangle:");
		s1 = sc.nextDouble();
		System.out.print("Input  length of 2nd Side of a Triangle:");
		s2 = sc.nextDouble();
		System.out.print("Input  length of 3rd Side of a Triangle:");
		s3 = sc.nextDouble();
		S = (s1 + s2 + s3) / 2;
		area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
		System.out.format("The Area of the triangle =%.2f\n", area);
	}
}