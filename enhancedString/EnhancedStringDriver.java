import java.util.Scanner;

class EnhancedStringDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
        String sentence = sc.nextLine();
		EnhancedString obj = new EnhancedString(sentence);

        System.out.println("\n----Reverse of the Sentence----");
		obj.reverse();

        System.out.println("\n----Reverse of each words----");
		obj.reverseWords();

        System.out.println("\n----Title Case of the Sentence----");
        obj.titleCase();
		
		System.out.print("\nEnter a character : ");
		char c= sc.next().charAt(0);
		obj.countChar(c);
        
		
	}
}