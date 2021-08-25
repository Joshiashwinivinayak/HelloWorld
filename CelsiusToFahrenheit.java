//Write a program in JAVA to convert temperature in Celsius to Fahrenheit.

import java.util.Scanner;
class CelsiusToFahrenheit {
	public static void main(String[] args) {
		float cel, far;
		Scanner s = new Scanner(System.in);
		System.out.print("Input temp. in Celsius:");
		cel = s.nextInt();
		far = cel * 9 / 5 + 32;
		System.out.println("Temperature in Celsius:" + cel);
		System.out.println("Temperature in Fahrenheit:" + far);
	}
}