package Programs;
import java.util.Scanner;
public class Swapping_numberm {
	public static void main(String[] args) {
		
	
	int x,y;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the first number ");
	x=sc.nextInt();
	
	System.out.println("Enter the second number ");
	y=sc.nextInt();
	
	System.out.println("Before Swapping ");
	System.out.println("x = " + x + "y = " +y);
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.println("After swapping ");
	System.out.println("x = " + x + "y = " +y);

}
}





