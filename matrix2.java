import java.util.Scanner;

class Matrix{
	int[][] data;
	int r,c;
	
	Matrix(int r,int c){
		this.r=r;
		this.c=c;
		data = new int[r][c];
	}
	
	void getData(Scanner sc){	
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				data[i][j] = sc.nextInt();
	}
	
	Matrix add( Matrix b){
		Matrix result = new Matrix(this.r,this.c);
		
		for(int i=0;i<this.r;i++)
			for(int j=0;j<c;j++)
				result.data[i][j]= this.data[i][j]+b.data[i][j];
				
		return result;
	}
	
	void display(){
		System.out.println("Resultant matrix after Addition");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
				System.out.print(data[i][j]+"\t");
			System.out.println();
		}
	}

}

class MatrixAddDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r,c;
		System.out.println("Enter matrix row size : ");
		r = sc.nextInt();
			
		System.out.println("Enter matrix column size :");
		c = sc.nextInt();
		
		Matrix m1 = new Matrix(r,c);
		Matrix m2 = new Matrix(r,c);
		Matrix m3 = new Matrix(r,c);
		
		System.out.println("Enter elements of first matrix ");
		m1.getData(sc);
		
		System.out.println("Enter elements of second matrix ");
		m2.getData(sc);
		
		m3 = m1.add(m2);
		
		System.out.println("Matrix 1");
		m1.display();
		
		System.out.println("Matrix 2");
		m2.display();
		
		System.out.println("Resultant Matrix");
		m3.display();
	}
}


