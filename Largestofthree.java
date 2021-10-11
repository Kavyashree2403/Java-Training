import java.util.Scanner;
public class Largestofthree {
	public static void main (String []args) {
		int a, b, c, big;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a>=b && a>=c)
		
			System.out.println(a+ " is the largest number");
		
		else if(b>=c && b>=a)
		
			System.out.println(b+ " is the largest number");
		else 
			System.out.println(c+ " is the largest number");
		
	}
}
		

	
	

