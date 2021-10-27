package Java_Assessment;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	  {
		 int n;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 n = scan.nextInt();	
		  
	    int  firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");
	    for (int i = 1; i <= n; ++i) 
	    {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
}