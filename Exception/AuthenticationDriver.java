import java.util.Scanner;
public class AuthenticationDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		AuthenticationService service = new AuthenticationService();
		
		System.out.println("----Create Account---");
		System.out.print("Username : ");
		String username = sc.next();
		System.out.print("Password : ");
		String password = sc.next();
		
		service.setCredentials(username,password);
		
		System.out.println("----Login---");
		System.out.print("Username : ");
		username = sc.next();
		System.out.print("Password : ");
		password = sc.next();
		service.authenticate(username,password);
		
		
	}
}
