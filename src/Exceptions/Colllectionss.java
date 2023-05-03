package Exceptions;
import java.util.*;  
//import java.util.ArrayList;
//import java.util.List;


public class Colllectionss {
	
	public static void main(String args []) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
	
	Iterator i = list.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	list.remove(3);
	System.out.println(list);   ///    remove method
	
	//list.clear();
	//System.out.println(list);   ///    remove method

	

             ArrayList <Integer> list2 = new ArrayList<Integer>();
              list2.addAll(list);
              System.out.println(list2);
	
}
}
