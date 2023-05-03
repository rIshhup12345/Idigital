package DailyLearning;

class UnderageException extends Exception{
	
	UnderageException(){
		super("you are under age");
	}
	
	UnderageException(String mes){
		super(mes);
	}
	
}


public class CustomException {

	public static void main(String[] args) throws UnderageException {
		
		 int age = 25;
		 
		 try {
			 if(age<18) {
				 throw new UnderageException();
			 }
			 else {
				 System.out.println("you can vote");
			 }
		 }catch(UnderageException e) {
			 System.out.println(e);
		 }
		

	}

}
