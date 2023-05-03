package Oops;

class Vehical{
	
	public void Move(String name) {
		System.out.println("this is car");
	}
	
}


public class AllConstructor extends Vehical{
	
	public void Move() {
		System.out.println("this is bike");
	}

	public int Shapes(int a) {
		
		return a;
	}
	
public int Shapes(int a,int b) {
		
		return a+b;
	}

    public int Shapes(int a,int b,int c) {
	
	return a+b+c;
}

public void Shapes(int a,int b,int c,int d) {
	
	System.out.println(a*b+c);
}
	
	public static void main(String args[]) {
		
		AllConstructor c1 = new AllConstructor();
		
		
//		System.out.println(c1.Shapes(1));
//		
//		System.out.println(c1.Shapes(1,3));
//		
//		c1.Shapes(3, 3, 3, 3);
//		
//		System.out.println(c1.Shapes(1, 2, 3));
		
		c1.Move("Rishabh");
	
	}
	
}
