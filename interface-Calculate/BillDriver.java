import java.util.Scanner;

class BillDriver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of products : ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for(int i=0;i<n;i++){
            System.out.println("\nProduct "+(i+1));
            System.out.print("ID : ");
            int productID = sc.nextInt();
            System.out.print("Name : ");
            String name = sc.next();
            System.out.print("Unit Price : ");
            double unitPrice = sc.nextDouble();
            System.out.print("Quantity : ");
            int quantity = sc.nextInt();

            products[i]=new Product(productID,quantity,name,unitPrice);
        }

        Bill bill = new Bill();
        bill.calculate(products);
        System.out.println("\n\nNet Amount : "+bill.netAmount);

    }
}
