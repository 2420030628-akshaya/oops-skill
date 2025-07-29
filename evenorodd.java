//java program whether it is odd or even
package cse;
import java.util.Scanner;
public class evenorodd {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = reader.nextInt();
			if(num % 2 == 0)
				System.out.println("Even number");
			else
				System.out.println("Odd number");
				
	}

}
