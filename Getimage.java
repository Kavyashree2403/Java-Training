package InheritanceExample;
import java.util.Scanner;
public class Getimage {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	StringBuffer str = new StringBuffer();
	StringBuffer rev = new StringBuffer();
	str.append(sc.nextLine());
	System.out.print(str);
	rev=str.reverse();
	System.out.print(" | " +rev);
	}
	}

	