//Write a program in JAVA to display various type or arithmetic operation using mixed data type.

class DataTypeOperation { 
public static void main (String[] args)
{
int M1=5,M2=8;
double D1= 3.7 , D2=7.4;
System.out.println("Display arithmetic operations with mixed data type:" );
System.out.println("-------------------------------------");
System.out.println("5+8 = "+(M1+M2));
System.out.println("3.7+7.4 = "+(D1+D2));
System.out.println("5+3.7 = " +(M1+D2));
System.out.println("5-8 = "+(M1-M2));
System.out.println("3.7-7.4 = "+(D1-D2));
System.out.println("5-7.4 = " +(M1-D2));
System.out.println("5*8 = "+(M1*M2) );
System.out.println("3.7*7.4 = "+(D1*D2));
System.out.println("5*7.4 = " +(M1*D2));
System.out.println("5/8 = "+(M1/M2));
System.out.println("3.7/7.4 = "+(D1/D2));
System.out.println("5/7.4 = " +(M1/D2));
}
}