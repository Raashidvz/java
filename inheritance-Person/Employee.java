class Employee extends Person{
	int id;
	double salary;
	String address;
	
	Employee(String name,String gender,int age,int id, double salary, String address){
		super(name,gender,age);
		this.id=id;
		this.salary=salary;
		this.address=address;
	}
}
