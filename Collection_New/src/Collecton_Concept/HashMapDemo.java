package Collecton_Concept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) 
	{
	  //HashMap is a class implements Map interface
	 //Extends AbstractMap
	//it may be one null key and multiple null values
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "Sudha");
		hm.put(2, "Raj");
		hm.put(3, "Shiva");
		hm.put(4, "Sushil");
		hm.put(5, "Sushil");
		
		System.out.println(hm);
		
		for(Entry<Integer,String> h:hm.entrySet())
		{
			System.out.println(h.getKey()+"  "+h.getValue());
		}
		
		hm.remove(4);
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp=new HashMap<>();
		
		Employee e1=new Employee("Sudha",28,"Deptq");
		Employee e2=new Employee("Raj",26,"Director");
		Employee e3=new Employee("Shiva",8,"Doctor");
		
		for(Entry<Integer,Employee>hh:emp.entrySet())
		{
			int key=hh.getKey();
			Employee e=hh.getValue();
			
			System.out.println(e.name+ " "+e.age+"  "+ e.dept);
		}
		

	}

}
