import java.util.Scanner;
public class Month
{
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter month");
		int month;
		month= input.nextInt();
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			System.out.println("number of days in 31");
		else if(month == 2) 
		{
			System.out.println("Number of days is 29");
		}
		else
		{
			System.out.println("Number of days is 30");
		}
	}
}
