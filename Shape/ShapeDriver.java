import java.util.Scanner;

class ShapeDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Circle----");
		System.out.print("Enter radius : ");
		double radius = sc.nextDouble();
		Shape circle = new Shape();
		System.out.println("Area : "+circle.area(radius));
		
		System.out.println("----Rectangle----");
		System.out.print("Enter Length : ");
		double length = sc.nextDouble();
		System.out.print("Enter Breadth : ");
		double breadth = sc.nextDouble();
		Shape rectangle = new Shape();
		System.out.println("Area : "+rectangle.area(length,breadth));
		
		System.out.println("----Square----");
		System.out.print("Enter side : ");
		int side = sc.nextInt();
		Shape square = new Shape();
		System.out.println("Area : "+square.area(side));
		
		System.out.println("----Triangle----");
		System.out.print("Enter Base : ");
		float base = sc.nextFloat();
		System.out.print("Enter Height : ");
		float height = sc.nextFloat();
		Shape triangle = new Shape();
		System.out.println("Area : "+triangle.area(base,height));
		
		
		
	}
}
