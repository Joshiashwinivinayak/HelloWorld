//Write a program in JAVA to find the area and circumference of a circle.

import java.util.Scanner;
public class AreaCircumferenceOfCircle {
	public static void main(String args[]) {
		float r;
		double area, circumference;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Radius of Circle : ");
		r = sc.nextFloat();
		area = 3.14 * r * r;
		circumference = 2 * 3.14 * r;
		System.out.println("The Area of Circle = " + area);
		System.out.println("The Circumference of Circle = " + circumference);
	}
}