//Write a program in JAVA to convert temperature in Kelvin to Celsius. 
//Sample Output:
//Convert temperature in Kelvin to Celsius :
//---------------------------------------------------------------
//Input the temperature in Kelvin : 300
//The temperature in Kelvin : 300
//The temperature in Celsius : 26.85

import java.util.Scanner;
class KelvinToCelsius {
	public static void main(String args[]) {
		Double cel;
		int kel;
		System.out.println("Convert temperature in Kelvin to celsius:");
		System.out.println("-------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the temperature in Kelvin:");
		kel = sc.nextInt();
		cel = (kel - 273.15);
		System.out.println("The temperature in kelvin:" + kel);
		System.out.println("The temperature in celsius:" + cel);
	}
}