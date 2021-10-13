package collections;

import java.util.LinkedList;
public class Linklist2 {

public static void main(String args[])
{
LinkedList<String> ll = new LinkedList<String>();
ll.add("A");
ll.add("B");
ll.addLast("C");
ll.addFirst("D");
ll.add(2,"E");
System.out.println(ll);
ll.remove("B");
System.out.println(ll);
ll.remove(3);
System.out.println(ll);
ll.removeFirst();
ll.removeLast();
System.out.println(ll);
//ll.clear();
//System.out.println("\n\n");
ll.add("A");
ll.add("B");
ll.add(3,"Sonu");
System.out.println(ll);
ll.clear();
System.out.println("\n\n");
ll.add("Trainee");
ll.add("Engineer");
System.out.println(ll);
ll.add(1,"Software");
System.out.println(ll);
}
}