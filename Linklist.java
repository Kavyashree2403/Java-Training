package collections;
import java.util.LinkedList;
public class Linklist {	
	  public static void main(String[] args){
	    // create linkedlist
	    LinkedList<String> animals = new LinkedList<>();

	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    animals.add("Monkey");
	    animals.add("Lion");
	    System.out.println("LinkedList: " + animals);
	    
	    animals.remove(1);
	    System.out.println( "List when animal[1] is removed " +animals);
	    animals.removeFirst();
	    System.out.println( "removes the first element from the list"+animals);
	    animals.removeLast();
	    System.out.println(  "removes the last element from the list"+animals);
	  }
}
