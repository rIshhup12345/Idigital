package Oops;

import java.util.Scanner;

class Younger extends RuntimeException {
	
	Younger(String msg){
		super(msg);
	}
	
}



public class Constructoroverloading {
	
	public static void main(String args[]) {
	
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		try {
		if(age<18) {
			throw new Younger("You are not Eligible");
		}else {
			System.out.println("yor can vote sucessfully");
		}
		}catch(Younger e) {
			System.out.println(e);
		}
		
		
	}
	
	
}
