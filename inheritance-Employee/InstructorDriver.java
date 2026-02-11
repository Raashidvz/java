import java.util.Scanner;
class InstructorDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of Instructors : ");
		int n = sc.nextInt();
		Instructor[] instructor = new Instructor[n];
	
		
		for(int i=0;i<n;i++){
			System.out.println("Enter Details of Employee "+(i+1));
			
			System.out.print("ID : ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name : ");
			String name = sc.nextLine();
			
			System.out.print("Salary : ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Address : ");
			String address = sc.nextLine();
			
			System.out.print("Department : ");
			String department = sc.nextLine();
			
			System.out.print("Subjects Taught : ");
			String subjects = sc.nextLine();
			
			instructor[i] = new Instructor(id,name,salary,address,department,subjects);
		}
		
		for(int i=0;i<n;i++){
			System.out.println();
			System.out.println("Employee "+(i+1));
			instructor[i].display();
		}
	}
}
