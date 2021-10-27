package Java_Assessment;
import java.util.Scanner;
public class Power 
{
	  public static void main(String[] args) 
	  {
	    int base;
	   		 Scanner scan = new Scanner(System.in);
	   		 System.out.println("Enter the base ");
	   		 base = scan.nextInt();	
	   		 
			 int exponent;
			 Scanner scan1 = new Scanner(System.in);
			 System.out.println("Enter the exponent ");
			 exponent = scan1.nextInt();				 	    
	    double result = Math.pow(base, exponent);

	    System.out.println("Answer = " + result);
	  }
}