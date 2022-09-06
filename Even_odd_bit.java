package Programs;

import java.util.Scanner;

public class Even_odd_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number");
		x=sc.nextInt();
		int n=x+1;//condition to check even or odd
		int n2=x^1;
		if(n==n2) 
			System.out.println("The given number is even "+x);
		else
			System.out.println("The given number is odd "+x);
		}
		

	}


