package collections;

public class Throw {
	  int age;
	  public static void display(int age) {
	    if(age>60)
	      throw new ArithmeticException("Senior citizens are not allowed");
	    else
	      System.out.println("Person with age: " + age + " is allowed");
	  }
	  
	  public static void main(String[] args) {
	    display(65);
	  }
	}