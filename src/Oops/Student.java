package Oops;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Student {

	String studentname;
	String studebtcity;
	int studentid;
	
	
	
	public Student(String n, String c, int i) {
		// TODO Auto-generated constructor stub
		studentname =n;
		studebtcity =c;
		studentid = i;
	}
	
	public Student() {
		System.out.println("second constructor");
	}

	public void show() {
		
		System.out.println(" Show method run " +  " " + studentname + " " + studebtcity + " " + studentid);
	}
	
//	public String Shon() {
//		return studentname ;		
//	}
	
	
//	Arraylist<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//	
//	List< integer> list2 = list.strem().filter(i->i%2==0).collect(Collectors.toList())
//			System.out.printin(list2);
//	
	
}
