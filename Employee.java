package classobject;
import java.util.Scanner;
public class Employee 
{
String name;
int eid;
String contact;
double salary;
String department;
char gender;
String address;
String designation;
Scanner sc=new Scanner(System.in);
void getInput()
{
System.out.println("enter name:");
name=sc.next();
System.out.println("enter employee id:");
eid=sc.nextInt();
System.out.println("enter contact:");
contact=sc.next();
System.out.println("enter salary:");
salary=sc.nextDouble();
System.out.println("enter department:");
department=sc.next();
System.out.println("enter gender:");
gender=sc.next().charAt(0);
System.out.println("enter address:");
address=sc.next();
System.out.println("enter designation:");
designation=sc.next();
}
/*
double print(double percentage) {
double commission= percentage/100* salary;
return commission;
}*/

void displaydetails() {
	System.out.println("Details of the employee are:");
System.out.println(name);
System.out.println(eid);
System.out.println(contact);
System.out.println(salary);
System.out.println(department);
System.out.println(gender);
System.out.println(address);
System.out.println(designation);
}
/*double calculateSalary(double commission) {
	double totalsalary=salary+commission;
	return totalsalary;
}*/
}



