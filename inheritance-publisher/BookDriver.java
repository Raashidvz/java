import java.util.Scanner;
class BookDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter category (1-Literature, 2-Fiction): ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.println("Enter Publisher Name: ");
        String publisher = sc.nextLine();

        System.out.println("Enter Price: ");
        double price = sc.nextDouble();

        if (choice == 1) {
            Literature l = new Literature(publisher, title, price);
            l.display();
        } else if (choice == 2) {
            Fiction f = new Fiction(publisher, title, price);
            f.display();
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}