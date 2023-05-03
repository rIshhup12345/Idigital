package Exceptions;

public class AchiveAbstracinteface implements CarStop , CarStart {

	@Override
	public void start() {
		System.out.println("Start mrethod call");
		
	}

	@Override
	public void stop() {
System.out.println("Stopmethod call");		
	}
	
	public void run() {
		System.out.println("hloo");
	}

	public static void main(String args[]) {
		
		AchiveAbstracinteface obj = new AchiveAbstracinteface();
		
		obj.start();
		obj.stop();
		obj.run();
	}
	
	
}
