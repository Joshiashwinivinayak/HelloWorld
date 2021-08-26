//Write a program in JAVA to print the area and perimeter of a rectangle. 
//Sample Output:
//Print the area and perimeter of a rectangle:
//---------------------------------------------------------------
//Input the width of the rectangle: 8.5
//Input the height of the rectangle: 5.6
//The area of the rectangle is: 47.6
//The perimeter of the rectangle is: 28.2

import java.util.Scanner;
public class Area_Perimeter_Of_Rectangle {
public static void main(String[] args) {
         float height, width, area, perimeter;
         Scanner in = new Scanner(System.in);
         System.out.println("Print the area and perimeter of a rectangle:");
         System.out.println("-------------------------------------");
        System.out.print("Input width of the rectangle:");
        width  = in.nextFloat();
        System.out.print("Input height of the rectangle:");
        height = in.nextFloat();
        perimeter = 2 * (height + width);
        area = height* width;
        System.out.println("Perimeter of rectangle is:" + perimeter);
        System.out.println("Area of rectangle is:" + area);
    }
}