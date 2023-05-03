package DailyLearning;

class CustumException extends Exception{
	
	CustumException(){
		super("hleo");
	}
	
	
}

public class Cuustomer {

	public static void main(String[] args) throws CustumException {

		int age = 20;
		try {
		if(age>16) {
			throw new  CustumException();
		}
		}
		
	catch(CustumException e){
		System.out.println(e);
	}
	}
}

