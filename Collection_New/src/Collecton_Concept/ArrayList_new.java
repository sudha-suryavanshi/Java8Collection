package Collecton_Concept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_new {

	public static void main(String[] args) 
	{
//	  ArrayList<String>arr1=new ArrayList<>();//Using Generics
//	  arr1.add("Sudha");
//	  arr1.add("Shiva");
//	  arr1.add("Raj");
//	  
//	  for(int i=0;i<arr1.size();i++)
//	  {
//		  System.out.println(arr1.get(i));
//	  }
		
	//*******************************************************************	
		
		//User Defined Arraylist
	  Employee e1=new Employee("Naveen",28,"QA");
	  Employee e2=new Employee("Sudha",35,"Nothing");
	  Employee e3=new Employee("Rajesh",36,"Director");
	  
	  
	  
	  ArrayList<Employee>a4=new ArrayList<>();
	  a4.add(e1);
	  a4.add(e2);
	  a4.add(e3);
	  
	  Iterator<Employee> it=a4.iterator();
	  while(it.hasNext())
	  {
		  Employee emp=it.next();
		  System.out.println(emp.name);
		  System.out.println(emp.age);
		  System.out.println(emp.dept);
		  
	  }
	}

}
