import java.util.Scanner;

class Product{
	int pcode;
	String pname;
	double price;
	
	void getData(Scanner sc){
		System.out.println("Enter product code :");
		pcode = sc.nextInt();
		System.out.println("Enter product name : ");
		pname = sc.next();
		System.out.println("Enter product price : ");
		price = sc.nextDouble();
	}
	
	void display(){
		System.out.println("Product code : "+pcode);
		System.out.println("Product Name : "+pname);
		System.out.println("Product Price : "+price);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("Enter details of product 1");
		p1.getData(sc);
		
		System.out.println("Enter details of product 2");
		p2.getData(sc);
		
		System.out.println("Enter details of product 3 ");
		p3.getData(sc);
		
		Product lowest = p1;
		if(p2.price < lowest.price)
			lowest=p2;
		if(p3.price < lowest.price)
			lowest=p3;
			
		System.out.println("Product with lowest price ");
		lowest.display();
		
		sc.close();
	}
}

