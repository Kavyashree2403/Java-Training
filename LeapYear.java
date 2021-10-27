package Java_Assessment;

import java.util.Scanner;
public class LeapYear
{
public static void main(String[] args)
{
int year,a,b;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the year:");
year = scan.nextInt();
if(year!=0)
{
a = (year % 400 ==0) ? (b=1) : ((year % 100==0)?(b=0):((year % 4 == 0)?(b = 1):(b = 0)));
if(a ==1)
System.out.println(year+" is a leep year");
else
System.out.println(year+" is not a leep year");

}
else
System.out.println(year+" does not exist");
}
}