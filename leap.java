import java.util.Scanner;
public class leap 
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter year");
		int year;
		year= input.nextInt();
		System.out.println((year % 4 ==0) && (year % 100 !=0)|| (year % 400 ==0)? year+ " is a leap year": year+ " is not a leap year");
	}
}