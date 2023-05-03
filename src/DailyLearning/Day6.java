package DailyLearning;

//Write a Java program to demonstrate the use of 'this' keyword.
//
//
//class A{
//	
//	String name = "Hello";
//	int id = 12;
//	
//	
//	A(String name,int id) {
//	
//		
//		this.name = name;
//		this.id = id;
//		
//	}
//	public void Run() {
//		System.out.println(name + "  " +id);
//		
//	}
//	
//}
//
//
//public class Day6  {
//
//	public static void main(String args[]) {
//		
//		A obj = new A("hhhh",11);
//		
//		obj.Run();
//		
//	}
//
//}

//5. Write a Java program to demonstrate the use of default and parameterized constructors

//public class Day6  {
//	
//	int age;
//	String name;
//	
//	Day6(){
//		System.out.println("default");
//	}
//	
//	Day6(int age,String name){
//		System.out.println("peremeterized");
//	}
//	
//	public static void main(String args[])
//	{
//		
//		Day6 obj = new Day6();   
//		
//		Day6 obj2 = new Day6(12,"kids");
//	}
//	
//}

//6. Write a Java program to demonstrate the use of 'super' method.

// 9 inherirance
//11. Write a Java program to demonstrate multilevel inheritance.

//class A {
//	String name;
//
//	public void Run() {
//		System.out.println("Class a run method call");
//	}
//}
//
//class B extends A {
//
//	int age;
//
//	public void Stop() {
//		System.out.println("Class b run method call");
//	}
//
//}
//
//public class Day6 extends B{
//
//	public static void main(String args[]) {
//
//		B obj1 = new B();
//		obj1.name = "Rishabh";
//		obj1.age = 22;
//		
//		System.out.println(obj1.name+" " +obj1.age);
//		obj1.Run();
//
//		obj1.Stop();
//	}
//
//}


//q29 29.	Write a Java program to demonstrate the use of access modifiers for a class with public, private, and protected properties.


//class A {
//	static String name = "Rishabh";
//
//	static public void Run() {
//		System.out.println("Class a run method call");
//	}
//}
//
//class B extends A {
//
//	private int age = 22;
//
//	private void Stop() {
//		System.out.println("Class Private  method call");
//	}
//
//}
//
//class C extends B {
//
//	protected int id;
//
//	protected void Walk() {
//		System.out.println("Class Walk  method call");
//	}
//
//}
//
//public class Day6 extends C {
//
//	public static void main(String args[]) {
//
//		C obj = new C();
//		obj.id = 11;
//
//		System.out.println(obj.id + " " + obj.name);
//
//		obj.Run();
//		obj.Walk();
//	}
//
//}


//QQQQ26

//
//class Animals{
//	
//	public void Run() {
//		System.out.println("All  animals are run");
//	}
//}
//
//class Mammals extends Animals{
//	public void Eat() {
//		System.out.println("Eat methods in Mammals");
//	}
//	
//}
//
//class Bird extends Animals{
//	public void Fly() {
//		System.out.println("fly method in Bird");
//	}
//	
//}
//
//
//class Fish extends Animals{
//	
//	public void Swim() {
//		System.out.println("swim method in fish");
//	}
//	
//}
//
//
//public class Day6{
//	
//	public static void main (String args[]) {
//		
//		Animals obj = new Animals();
//		obj.Run();
//		Fish  obj2  = new Fish();
//		obj2.Swim();
//		
//	}
//	
//}

