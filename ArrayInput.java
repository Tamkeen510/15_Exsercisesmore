import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array =new int[10];
		int sum=0;
		System.out.println("enter the element;");
		for (int i=0; i<10; i++)
		array[i] = scanner.nextInt();
		
		for(int num : array) {
			sum = sum+num;
			System.out.println("Sum of the array elements is;"+sum);
			
		}
			
		
		
		
	}
}
