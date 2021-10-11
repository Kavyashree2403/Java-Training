import java.util.Scanner;
public class Largestoftwo {
	public static void main (String []args) {
		int a, b, big;
		Scanner input=new Scanner(System.in);
		{
		System.out.println("enter two numbers:");
		a=input.nextInt();
		b=input.nextInt();
		}
		if (a>b)
		{
			big=a;
		}
		else
		{
			big=b;
		}
		System.out.println("Largest of two numbers:"+big);
	}
	
	
}
