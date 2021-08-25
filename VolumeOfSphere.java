//Write a program in JAVA to calculate the volume of a sphere.

import java.util.Scanner;
class VolumeOfSphere {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the radius of sphere:");
		double r = sc.nextDouble();
		double  volume = (4 * 22 * r * r * r) / (3 * 7);
		System.out.println("Volume is:" + volume);
	}
}