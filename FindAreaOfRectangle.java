import java.util.Scanner;

public class FindAreaOfRectangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kindly enter the length of rectangle:");
		double length = scan.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width = scan.nextDouble();
		

		double area = length*width;
		System.out.println("Area Of Rectangle is.....:"+area);

				
	
	}
}
