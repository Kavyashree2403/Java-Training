package Java_Assessment;
import java.util.Scanner;
public class HCF 
{
	public static void main(String args[])
	{
	      int a, b, i, hcf = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter first number : ");
	      a = sc.nextInt();
	      System.out.println("Factors of " + a + " are: ");	     
	      for (int x = 1; x <= a; ++x) {	        
	        if (a % x == 0) {
	          System.out.println(x + " ");
	        }
	      }
	      
	      System.out.println("Enter second number :: ");
	      b = sc.nextInt();
	      System.out.println("Factors of " + b + " are: ");	     
	      for (int x = 1; x <= b; ++x) {	        
	        if (b % x == 0) {
	          System.out.println(x + " ");
	        }
	      }
	      
	      for(i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
	     
	      System.out.println("HCF of given two numbers is ::"+hcf);
	   }	
	}
