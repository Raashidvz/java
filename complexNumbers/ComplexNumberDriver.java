import java.util.Scanner;

class ComplexNumberDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		ComplexNumber c1=new ComplexNumber();
		ComplexNumber c2=new ComplexNumber();
		ComplexNumber c3=new ComplexNumber();
	
	    System.out.println("Complex Number 1");
	    c1.readData(sc);
		System.out.println("\nComplex Number 2");
		c2.readData(sc);
		
		c3 = c1.add(c2);
		
		System.out.println("\nComplex Numeber 1");
		c1.display();
		
		System.out.println("\nComplex Number 2");
		c2.display();
		
		System.out.println("\nResultant Complex Number");
		c3.display();
		
		sc.close();
	}
}
