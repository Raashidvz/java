import java.util.Scanner;
import java.util.HashMap;

class StudentDriver{
	HashMap<String,Student> records = new HashMap<>();
	
	void searchStudent(String admno){
		if(records.containsKey(admno)){
			System.out.println("Student found");
			records.get(admno).display();	
		}else{
			System.out.println("Student not found");
		}
	}
	
	void removeStudent(String admno){
		if(records.containsKey(admno)){
			records.remove(admno);
			System.out.println("Student "+admno+" removed");
		}else{
			System.out.println("No such student found");
		}
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		StudentDriver mca = new StudentDriver();
		
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Student "+(i+1));
			System.out.print("Name : ");
			String name = sc.next();
			System.out.print("Age : ");
			int age = sc.nextInt();
			System.out.print("Rank : ");
			int rank = sc.nextInt();
			
			Student s = new Student(name,age,rank);
			String admissionNo = "MCA25" + (i+1);
			mca.records.put(admissionNo,s);
		}
		
		int choice;
		do{
			System.out.print("\n1. Search student\n2. Remove Student\n0. Exit\nEnter your choice : ");
			choice = sc.nextInt();
			String admno;
			switch(choice){
				case 1: System.out.print("Enter Admission No. : ");
					admno=sc.next();
					mca.searchStudent(admno);
					break;
				case 2: System.out.print("Enter Admission No. : ");
					admno=sc.next();
					mca.removeStudent(admno);
					break;
				case 0: System.out.println("Exiting.......");
					break;
				default: System.out.println("Invalid input, try again.....");		 
					 
			}
		}while(choice!=0);
		
		sc.close();
		
	}
}
