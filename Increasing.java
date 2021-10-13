package Functioncall;
import java.util.Scanner;
public class Increasing 
{
static boolean checkNumber()
{
boolean check=false;
int n;
int rev=0,rem=0,rem1,div;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number: ");
n=scan.nextInt();

while(n > 0)
{
rem = n %10;
rem1 = n % 100;
div = rem1 / 10;
n=n/10;
if(rem > div)
{
check = true;
continue;
}
else
{
check = false;
break;
}
}
System.out.println(check);
return check;
}

public static void main(String args[])
{
checkNumber();
}
}