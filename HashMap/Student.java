import java.util.HashMap;
public class Student{
	HashMap <Integer,Double> student = new HashMap<>();
	
	void addNew(int rollno,double mark){
		student.put(rollno,mark);
	}
	
	double searchStudent(int rollno){
		return student.getOrDefault(rollno,-1.1);
	}
	
	void removeStudent(int rollno){
		student.remove(rollno);
	}
	
	void updateStudentMark(int rollno, double mark){
		if(!student.containsKey(rollno)){
			System.out.println("No such Student exist");
			return;
		}
		student.put(rollno,mark);
	}
	
	void display(){
		System.out.println(student);
	}
}
