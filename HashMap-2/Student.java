import java.util.HashMap;
class Student{
	String name;
	int age,rank;
	
	public Student(String name,int age,int rank){
		this.name=name;
		this.age=age;
		this.rank=rank;
	}
	void display(){
		System.out.println("\nName : "+name);
		System.out.println("Age : "+age);
		System.out.println("Rank : "+rank);
	}
}
