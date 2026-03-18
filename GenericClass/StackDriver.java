import java.util.Scanner;

public class StackDriver{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----Stack Type-----");
        System.out.print(" 1. Integer \n 2. Character \n 3. String \n 4. Double \nSELECT OPTION : ");
        int choice = sc.nextInt();
        
        GStack<Object> gs = new GStack<>();  
        int op;
        do{

            System.out.println("\n\n-----Stack Operations-----");
            System.out.print("\n 1. PUSH \n 2. POP \n 3. Display \n 0. Exit \nSELECT OPTION : ");
            op = sc.nextInt();
            
            switch(op){
                case 1: 
                    System.out.print("Element to insert : ");
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

                case 2: 
                    gs.pop();
                    break;
                case 3:
                    gs.display();
                    break;
                case 0: 
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice, try again...");
            }
        }while(op!=0);
    }
}
