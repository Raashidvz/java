import java.util.Scanner;
class ShapeDriver{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("\n----MENU----");
			System.out.println("1. Circle\n2. Rectangle\n0.Exit\nEnter your choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 1: System.out.print("Enter Radius of circle : ");
					double radius = sc.nextDouble();
					
					Circle circle = new Circle(radius);
					System.out.println("Area : "+circle.area());
					System.out.println("Perimeter : "+circle.perimeter());
					break;
				case 2: System.out.print("Enter Length of Rectangle : ");
					double length = sc.nextDouble();
					System.out.print("Enter Width of Rectangle : ");
					double width = sc.nextDouble();
					
					Rectangle rectangle = new Rectangle(length,width);
					System.out.println("Area : "+rectangle.area());
					System.out.println("Perimeter : "+rectangle.perimeter());
					break;
				case 0: System.out.println("Exiting........");
					return;
				default: System.out.println("Invalid input , try again...");
			}
		}
	}
}
