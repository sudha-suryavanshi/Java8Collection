package Collecton_Concept;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) 
	{
	  LinkedList<String>ll=new LinkedList<>();
	  
	  ll.add("Naveen");
	  ll.add("Sudha");
	  ll.add("Raj");
	  ll.add("Shiva");
	  ll.add("Sushil");
	  ll.add("Shreyansh");
	  ll.add("Shreyansh");
	  
	  System.out.println(ll);
	  
	  ll.addFirst("Rajesh");
	  ll.addLast("Shivansh");
	  
	  System.out.println("After update: "+ll);
	  
	  for(String str:ll)
	  {
		  System.out.print("  "+str);
	  }
	}

}
