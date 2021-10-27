package Java_Assessment;
import java.util.Scanner;
public class CalculateStudentGrade {
	   public static void main(String args[]) {
	      Scanner sc = new Scanner (System.in);
	      System.out.println("Enter average of your marks:");
	      int M= sc.nextInt();
	      String grade = null;
	      if(M>95 && M<100)
	      {
	         grade = "A+";
	      }
	      else if(M>85 && M<=95)
	      {
	         grade = "A";
	      }
	      else if(M>80 && M<=85)
	      {
	         grade = "B+";
	      }
	      else if(M>70 && M<=80)
	      {
	         grade = "B";
	      }
	      else if(M>60 && M<=70)
	      {
	         grade = "C";
	      }
	      else if(M>50 && M<=60)
	      {
	         grade = "D";
	      }
	      else if(M<50 && M<0)
	      {
	         grade = "Fail" ;
	      }
	      else
	      {
	    	  System.out.println("The marks must be within 0 - 100 ");
	      }
	      System.out.println("Your grade is " + grade);
	   }
	}