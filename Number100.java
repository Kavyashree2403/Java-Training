package Java_Assessment;
import java.util.Scanner;
public class Number100 
{
	public static void main(String[] args)
	{
	int number;
	boolean res;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number :");
	number = scan.nextInt();
	res = (number <100) ? (true) : (false);
	System.out.println(res);
	}
}
