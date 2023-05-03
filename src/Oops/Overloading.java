package Oops;

class Animal{
	
	 public void  Cat() {
		System.out.println("Walking");
	}
	
	
}

public class Overloading extends Animal {


	public void  Cat() {
		System.out.println("running");
	}
	
	
	public int run(int a,int b) {
		return a+b;
		
	}
	public void run() {
		System.out.println("Runmethod");
	}
	
	public int run(int c,int b,int a) {
		return a+b+c;}
	
	public static void main(String args[]) {
		
		Overloading l1 = new Overloading();
		l1.run();
		
		System.out.println(l1.run(1, 2,6));
		
		l1.Cat();
		

		
	}
	
	
}
