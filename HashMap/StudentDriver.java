import java.util.Scanner;
class StudentDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Student mca = new Student();
		
		System.out.println("Student Mark List");
		
		int choice;
		do{
			System.out.print("\n1. Add Student\n2. Update Student Mark\n3. Remove student\n4. Search Student\n0. Exit\nEnter your choice : ");
			choice = sc.nextInt();
			int rollno;
			double mark;
			switch(choice){
				case 1: System.out.print("Enter Roll No. : ");
					rollno=sc.nextInt();
					System.out.print("Enter Mark : ");
					mark=sc.nextDouble();
					mca.addNew(rollno,mark);
					mca.display();
					break;
				case 2: System.out.print("Enter Roll No. : ");
					rollno=sc.nextInt();
					System.out.print("Enter Mark : ");
					mark=sc.nextDouble();
					mca.updateStudentMark(rollno,mark);
					mca.display();
					break;
				case 3: System.out.print("Enter Roll No. : ");
					rollno=sc.nextInt();
					mca.removeStudent(rollno);
					mca.display();
					break;
				case 4: System.out.print("Enter Roll No. : ");
					rollno=sc.nextInt();
					double result= mca.searchStudent(rollno);
					if(result!=-1.1){
						System.out.println("Mark is "+result);
					}else{
						System.out.println("No such student found");
					}
					break;
				case 0: System.out.println("Exiting.......");
					break;
				default: System.out.println("Invalid input, try again.....");		 
					 
			}
		}while(choice!=0);
	}
}
