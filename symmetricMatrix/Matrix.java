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