import java.util.Scanner;
public class Test1 {
	public static void main (String []args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+ " is a positive number");
		}
		else if(num<0)
		{
			System.out.println(num+ " is a negative number");
		}
		else
		{
			System.out.println("number is zero");
		}
	}
}
