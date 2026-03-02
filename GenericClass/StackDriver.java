import java.util.Scanner;
public class StackDriver{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----Stack Type-----");
		System.out.println(" 1. Integer \n 2. Character \n 3. String \n 4. Double \nSELECT OPTION : ");
		int choice = sc.nextInt();
		
		if(choice==1){
			GStack<Integer> gs = new GStack<>();
		}else if(choice==2){
			GStack<Character> gs = new GStack<>();
		}else if(choice==3){
			GStack<String> gs = new GStack<>();
		}else if(choice==4){
			GStack<Double> gs = new GStack<>();
		}else{
			System.out.println("Invalid choice , Exiting....");
			return;
		}
		
		while(true){
			System.out.print("\n 1. PUSH \n 2. POP \n 3. Exit \nSELECT OPTION : ");
			int op=sc.nextInt();
			switch(op){
				case 1: System.out.print("Element to insert : ");
					switch(choice){
						case 1: gs.push(sc.nextInt());
							break;
						case 2: gs.push(sc.next().charAt(0));
							break;
						case 3: gs.push(sc.next());
							break;
						case 4: gs.push(sc.nextDouble());
							break;
					}
					break;
				case 2: gs.pop();
					break;
				case 3: System.out.println("Exiting...");
					break;
				default:System.out.println("Invalid choice, try again...");
					break;
		
			}
			
		}
	}
}
