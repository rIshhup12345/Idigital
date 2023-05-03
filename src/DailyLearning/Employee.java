package DailyLearning;

public class Employee implements Comparable<Employee> {

	public String name;
	public int id;
	public int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int compareTo(Employee e) {
		if(salary>e.salary)
			return 1;
		else if(salary<e.salary)
			return -1;
		return 0;
	}

	public Employee() {
		super();
	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	
	
	
	}
