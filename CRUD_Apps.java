package com.ltts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrudApp {
	static HashMap<Integer,String> h=new HashMap<Integer,String>();
	static Scanner sc=new Scanner(System.in);
	//create
	static void create()
	{
		int key;
		String value;
		System.out.println("Enter key:");
		key=sc.nextInt();
		System.out.println("Enter value:");
		value=sc.next();
		h.put(key, value);
		System.out.println("Created successfully");
	}
	//display
	static void display()
	{
		System.out.println("Key->value");
		for(Map.Entry m : h.entrySet())
		{    
			System.out.println(m.getKey()+" -> "+m.getValue());    
	    }
	}
	 //update
	static void update()
	{
		int key;
		String value;
		System.out.println("Current HashMap");
		display();
		System.out.println("Enter the key to update");
		key=sc.nextInt();
		if(h.containsKey(key))
		{
		System.out.println("Enter the value to update");
		value=sc.next();
		h.put(key, value);
		System.out.println("updated succesfully");
		}
		else
		{
			System.out.println("Specified key is not present");
		}
		
	}
	//delete
	static void delete()
	{
		int key;
		System.out.println("Current HashMap");
		display();
		System.out.println("Enter the key to delete");
		key=sc.nextInt();
		h.remove(key);
		System.out.println("Deleted successfully");
	}
	
	public static void main(String[] args) { // Main function
		int ch;
		System.out.println("CRUD APP USING JAVA");
		do
		{
			System.out.println("MENU");
			System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \n5.exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt(); // Asking input from the user.
			switch(ch)
			{
				case 1: System.out.println("TO CREATE ENTER 1");
						create();
			 			break;
				case 2: System.out.println("TO READ ENTER 2");
						display();
			 			break;
				case 3: System.out.println("TO UPDATE ENTER 3");
						update();
			 			break;
				case 4: System.out.println("TO DELETE ENTER 4");
						delete();
			 			break;
				default: System.out.println("TO EXIT PRESS ANY KEY");
						break;
				
					
		    }
		}while(ch == 1 | 2 | 3 | 4)
		
	}

}
