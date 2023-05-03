package DailyLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class EmployeeTop3 {
   public static void main(String[]args) {
	   List<Employee> list = new ArrayList<>();
	   list.add(new Employee("sachin",1,12000));
	   list.add(new Employee("Rishabh",2 ,100));
	   list.add(new Employee("Rish",3 ,13900));
	   list.add(new Employee("Rishab",4 ,45));
	   
	   Collections.sort(list, Collections.reverseOrder());
	  
	 for(Employee e: list) {
		 System.out.println(e.id+" "+ e.salary+ " "+ " "+ e.name);
	 }
   }
}
