import java.util.Scanner;

class ContactDriver{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of contacts to create : ");
		int n = sc.nextInt();
		String name,number;
		Contact[] contacts = new Contact[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Enter details of contact "+(i+1));
			System.out.println("Enter Name : ");
			name = sc.next();
			System.out.println("Enter Number : ");
			number = sc.next();
			contacts[i] = new Contact(name,number);
		}
		
		System.out.println("Enter prefix to search : ");
		String prefix = sc.next();
		
		String result = Contact.nameLinearSearch(contacts, prefix);
		
		System.out.println("Result : "+result);
		
		Contact.sortContacts(contacts);

		System.out.println("Contact Names (A-Z)");
		for(int i=0;i<n;i++){
			System.out.println((i+1)+". "+contacts[i].name.str);
			System.out.println("\tNumber : "+contacts[i].number);
		}
			
	}
}
