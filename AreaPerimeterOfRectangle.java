//Write a program in JAVA to find the Area and Perimeter of a Rectangle.

import java.util.Scanner;
public class AreaPerimeterOfRectangle {
	public static void main(String[] args) {
		int l, b, perimeter, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input length of rectangle:");
		l = sc.nextInt();
		System.out.print("Input breadth of rectangle:");
		b = sc.nextInt();
		perimeter = 2 * (l + b);
		System.out.println("The Perimeter of rectangle:" + perimeter);
		area = l * b;
		System.out.println("The Area of rectangle:" + area);
	}
}