package collections;

public class HandlingException {


	 public static void main(String args[]){
		 int a=10;
		 System.out.println(a);
		 int b =2;
		 System.out.println(b);
	   try{
	     int data=55/5;
	     System.out.println(data);
	    }
	   catch(ArithmeticException e)
       {
    	System.err.println("Error");
    	} 
	    catch(NullPointerException e)
	       {
	    	System.out.println(e);
	    	} 
	  
	    finally {System.out.println("finally block is executed");}
	    System.out.println("remaining code");
	  }
	}