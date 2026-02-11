class Instructor extends Employee{
	String subjects_taught;
	String department;
	int instructor_id;
	
	Instructor(String name,String gender,int age,int id, double salary, String address,String subjects_taught,String department,int instructor_id){
		super(name,gender,age,id,salary,address);
		this.subjects_taught=subjects_taught;
		this.department=department;
		this.instructor_id=instructor_id;
	}
	
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Employee ID : "+id);
		System.out.println("Salary : "+salary);
		System.out.println("Address : "+address);
		System.out.println("Subjects Taught : "+subjects_taught);
		System.out.println("Department : "+department);
		System.out.println("Instructor ID : "+instructor_id);
	}
}
