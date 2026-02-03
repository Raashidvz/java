import java.util.Scanner;

class SymmetricMatrixDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.print("Enter order of matrix : ");
		r = sc.nextInt();
		
		Matrix m1 = new Matrix(r);

		System.out.println("Enter elements of first matrix ");
		m1.readData(sc);
		
		System.out.println("Matrix");
		m1.display();
		
		boolean isSymmetric=m1.symmetricCheck();
		
		if(isSymmetric)
	        System.out.println("Matrix is Symmetric");
	    else
	        System.out.println("Matrix is not Symmetric");
	
	}
}
