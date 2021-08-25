//Write a program in JAVA that converts kilometers per hour to miles per hour. 
//Sample Output:
//Convert kilometers per hour to miles per hour :
//---------------------------------------------------------------
//Input the distance in kilometer : 25
//The 25 Km./hr. means 15.5343 Miles/hr

import java.util.Scanner;
class KmToMiles {
	public static void main(String args[]) {
		Double miph;
		int kmph;
		System.out.println("Convert kilometers per hour to miles per hour");
		System.out.println("-------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the distance in kilometer:");
		kmph = sc.nextInt();
		miph = (kmph * 0.6213712);
		System.out.println("The " + kmph + " Km./hr. means " + miph + " Miles/hr.");
	}
}