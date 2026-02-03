import java.util.Scanner;
class ComplexNumber{
	int imaginary,real;
	
	void readData(Scanner sc){
		System.out.print("Real : ");
		this.real=sc.nextInt();
		System.out.print("Imaginary : ");
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