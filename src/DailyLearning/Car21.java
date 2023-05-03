package DailyLearning;

public class Car21 {

	private int cnumber;
	private String ownername;
	private String carname;


	public int getCnumber() {
		return cnumber;
	}

	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Override
	public String toString() {
		return "Car21 [cnumber=" + cnumber + ", ownername=" + ownername + ", carname=" + carname + "]";
	}

	public static void main(String[] args) {
//
	Car21 obj = new Car21();
		obj.cnumber = 12345;
		obj.ownername = "Rishabh";
		obj.carname = "Grandi10";
	
		System.out.println(obj.toString());
		
//	 System.out.println(obj.cnumber +" "+obj.ownername + " "+obj.carname );
//		
	}

}
