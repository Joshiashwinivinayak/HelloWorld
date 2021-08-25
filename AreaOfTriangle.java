//Write a program in JAVA to find the area of any triangle using Heron's Formula.

import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		double s1, s2, s3, area, S;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("Input  1st Side of a Triangle:");
		s1 = sc.nextDouble();
		System.out.print("Input  2nd Side of a Triangle:");
		s2 = sc.nextDouble();
		System.out.print("Input  3rd Side of a Triangle:");
		s3 = sc.nextDouble();
		S = (s1 + s2 + s3) / 2;
		area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
		System.out.format("The Area of triangle = %.2f\n", area);
	}
}