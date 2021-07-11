import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter the side of the square:");
		Scanner scanner=new Scanner (System.in);
		double side = scanner.nextDouble();
		double Area = side*side;
		System.out.println("Area Of Sqaure is:" +Area);
	}
}
