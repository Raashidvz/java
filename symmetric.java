import java.util.Scanner;

class Matrix{
	int[][] data;
	int r;
	
	Matrix(int r){
		this.r=r;
		data = new int[r][r];
	}
	
	void readData(Scanner sc){	
		for(int i=0;i<r;i++)
			for(int j=0;j<r;j++)
				data[i][j] = sc.nextInt();
	}
	
	boolean symmetricCheck(){
		for(int i=0;i<this.r;i++)
			for(int j=0;j<this.r;j++)
			    if(this.data[i][j] != this.data[j][i])
			        return false;

		return true;
	}
	
	void display(){
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++)
				System.out.print(data[i][j]+"\t");
			System.out.println();
		}
	}

}

class MatrixSymmetricDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.println("Enter order of matrix : ");
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

