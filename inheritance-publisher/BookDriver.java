import java.util.Scanner;
class BookDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of the book : ");
		System.out.pritln("----Publisher----");
		System.out.print("Name : ");
		String publisherName = sc.nextLine();
		System.out.print("Address : ");
		String address=sc.nextLine();
		System.out.print("Phone Number : ");
		String phone=sc.nextLine();
		
		System.out.pritln("----Book----");
		System.out.print("Title : ");
		String title = sc.nextLine();
		System.out.print("Author : ");
		String author=sc.nextLine();
		System.out.print("Price : ");
		double price=sc.nextDouble();
		System.out.print("Pages : ");
		int pages=sc.nextInt();
		
		System.out.pritln("----Literature----");
		System.out.print("Category : ");
		String category = sc.nextLine();
		System.out.print("Language : ");
		String language=sc.nextLine();
		
		System.out.pritln("----Fiction----");
		System.out.print("Genere (fantacy/sci-fi/mystery...) : ");
		String genre = sc.nextLine();
		System.out.print("Seires ? (true/false) : ");
		String isSeries=sc.nextLine();
		
		Fiction f1=new Fiction(publisherName,address,phone,title,author,price,pages,category,language,genre,isSeries);
	}
}
