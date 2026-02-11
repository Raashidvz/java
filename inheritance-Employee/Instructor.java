class Instructor extends Employee{
	String department,subjectsTaught;
	
	Instructor(int id, String name, double salary, String address,String department, String subjectsTaught){
		super(id,name,salary,address);
		this.department = department;
		this.subjectsTaught=subjectsTaught;
	}
	
	void display(){
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Address : "+address);
		System.out.println("Employee Department : "+department);
		System.out.println("Employee Subjects Taught : "+subjectsTaught);
	}
}

