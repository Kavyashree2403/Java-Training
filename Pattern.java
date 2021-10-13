package InheritanceExample;

import java.util.Scanner;
public class Pattern 
{

  public static void main(String[] args) 
  {
	int Number;
	Scanner input=new Scanner(System.in);
	System.out.print("enter rows:");
	Number=input.nextInt();
	input.close();
        for(int i=Number;i>0;i--)
        {
        	for(int j=0;j<Number-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=0;k<i;k++)
        	{
        		System.out.print(" ");
        	}
        	System.out.print("\n");
  for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
        }

  }
}
