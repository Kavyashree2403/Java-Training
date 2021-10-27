package Java_Assessment;
import java.util.Scanner;
public class CountFactors
{     	
		public static void main(String[] args)
		{
		int number = 9,count,i,j;
		System.out.print("Factors for:");
		for (i = 1; i <= number; i++)
		{
		count=0;
		for(j=1;j<=i;j++)
		{
		if (i % j == 0)
		{
		
		count++;
		}
		}
		System.out.print(" "+i+" is "+count+",");
		}
		}
}