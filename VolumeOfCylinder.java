//Write a program in JAVA to calculate the volume of a cylinder.

import java.util.Scanner;
class VolumeOfCylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the radius:");
		double r = sc.nextDouble();
		System.out.print("Input the height:");
		double h = sc.nextDouble();
		double  volume = ((22 * r * r * h) / 7);
		System.out.println("The volume of Cylinder is:" + volume);
	}
}