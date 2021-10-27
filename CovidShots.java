package Java_Assessment;
import java.util.Scanner;
public class CovidShots
{
	public static void main(String[] args)
	{
		int age;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the age :");
		age = scan.nextInt();
		if(age <=18)
			System.out.println("Not Eligible");
		else if(age >18 && age <=45)
			System.out.println("Eligible in a month");
		else if(age >45 && age <=60)
			System.out.println("Eligible in 15 days");
		else if(age >=60)
			System.out.println("Eligible now");
}
}