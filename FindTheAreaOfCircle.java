import java.util.Scanner;

public class FindTheAreaOfCircle {
	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		
		double radius=Scanner.nextDouble();
		double area = Math.PI * (radius*radius);
		System.out.println("The Area of the circle is :" +area) ;
		double circumference =Math.PI *2*radius;
		System.out.println("The Area of the circle is:" +circumference);
		
	}
}
