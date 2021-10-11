import java.util.Scanner;
public class Exercise2 {
public enum Weekdays{
SUNDAY, MINDAY, TUESDAY,WEDNESDAY,FRIDAY,SATURDAY
}

public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("For English press 1 \n For Hindi Press 2");
int choice= sc.nextInt();
String result="";
switch(choice) {
case 1:
result="You chose English";
break;
case 2:
result="You chose Hindi";
break;
default:
result="Invalid Choice";
break;
}
System.out.print(result);
sc.close();
}
}

