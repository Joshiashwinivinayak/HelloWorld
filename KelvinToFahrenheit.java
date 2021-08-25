//Write a program in JAVA to convert temperature in Kelvin to Fahrenheit. 
//Sample Output:
//Convert temperature in Kelvin to Fahrenheit :
//----------------------------------------------------------------
//Input the temperature in Kelvin : 300
//The temperature in Kelvin : 300
//The temperature in Fahrenheit : 80.33

import java.util.Scanner;
class KelvinToFahrenheit{
    public static void main(String args[]) {
     int kel;
     Double frh;
	System.out.println(  "Convert temperature in Kelvin to Fahrenheit:");
		System.out.println("-------------------------------------");
		Scanner sc=new Scanner(System.in);
    System.out.print("Input the temperature in Kelvin:");
    kel=sc.nextInt();
    frh = (9.0 / 5) * (kel - 273.15) + 32;
    System.out.println("The temperature in kelvin:" +kel);
    System.out.println("The temperature in Fahrenheit:" +frh);
}
}