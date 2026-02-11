import java.util.Scanner;

class InstructorDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of instructors : ");
		int n = sc.nextInt();
		Instructor[] instructor = new Instructor[n];
		
		for(int i=0;i<n;i++){
			System.out.println("\nEnter Details of Instructor "+(i+1));
			
			System.out.print("Employee ID : ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name : ");
			String name = sc.nextLine();
			
			System.out.print("Age : ");
			int age = sc.nextInt();
			
			System.out.print("Gender : ");
			String gender = sc.next();
			
			System.out.print("Salary : ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Address : ");
			String address = sc.nextLine();
			
			System.out.print("Department : ");
			String department = sc.nextLine();
			
			System.out.print("Subjects Taught : ");
			String subjects_taught = sc.nextLine();
			
			System.out.print("Instructor ID : ");
			int instructor_id = sc.nextInt();
			
			instructor[i] = new Instructor(name, gender, age, id, salary, address, subjects_taught, department, instructor_id);
		}
		
		for(int i=0;i<n;i++){
			System.out.println("\nInstructor : "+(i+1));
			instructor[i].display();
		}	
	}
}
