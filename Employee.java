package Java_Assessment;
import java.util.Scanner;
public class Employee {
public static void main(String args[])
{
int hours;
System.out.println("Enter the number of Hours the Employee worked");
Scanner sc = new Scanner(System.in);
hours = sc.nextInt();
if(hours <= 8)
{
System.out.println("Employee will be paid "+hours*250+" rupees");

}
else
{
System.out.println("Employee will be paid "+8*250+ " rupees");
System.out.println("Company will not pay for over time");
}
}
}