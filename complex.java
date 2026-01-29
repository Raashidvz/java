import java.util.Scanner;

class ComplexNumber{
	int imaginary,real;
	
	void readData(Scanner sc){
		System.out.println("Real : ");
		this.real=sc.nextInt();
		System.out.println("Imaginary : ");
		this.imaginary=sc.nextInt();
	}
	
	ComplexNumber add( ComplexNumber b){
	    ComplexNumber result = new ComplexNumber();
		result.real = this.real + b.real;
		result.imaginary = this.imaginary + b.imaginary;
        return result;
	}
	
	void display(){
	    if(this.imaginary>0)
		    System.out.println(this.real+" + "+this.imaginary+"i");
		else if(this.imaginary < 0)
		    System.out.println(this.real+" - "+(-this.imaginary)+"i");
		else
		    System.out.println(this.real);
	}

}

class ComplexDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		ComplexNumber c1=new ComplexNumber();
		ComplexNumber c2=new ComplexNumber();
		ComplexNumber c3=new ComplexNumber();
	
	    System.out.println("Complex Number 1:");
	    c1.readData(sc);
		System.out.println("Complex Number 2:");
		c2.readData(sc);
		
		c3 = c1.add(c2);
		
		System.out.println("Complex Numeber 1");
		c1.display();
		
		System.out.println("Complex Number 2");
		c2.display();
		
		System.out.println("Resultant Complex Number");
		c3.display();
		
		sc.close();
	}
}

