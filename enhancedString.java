import java.util.Scanner;

class EnhancedString{
	String str;
	
	EnhancedString(String str){
		this.str=str;
	}
	
	void reverse(){
		String rev="";
		
		for(int i=str.length()-1;i>-1;i--){
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}
	
	void reverseWords(){
		int i,check,j;
		String rev="";
		for (check=i=0;i<str.length();i++){
			if(str.charAt(i)==' ' || i==str.length()-1){
				for(j=i-1;j>=check;j--){
					rev+=str.charAt(j);	
				}
				rev+=" ";
				check=i+1;
			}
		}
		System.out.println(rev);
	}
	
	void titleCase(){
		if(str.length()>0){
			String[] words = str.split(" ");
			String result;
			for(int i=0;i<words.length();i++){
				String word = words[i];
				char c = word.charAt(0);
				c = Character.toUpperCase(c);
				String firstChar = String.valueOf(c);
				result = firstChar + word.subString(1);
				
			}
		}
	}
	
	void countChar(char c){
		int count=0;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i) == c)
				count+=1;
		}
		System.out.println("Character '"+c+"' occurs '"+count+"' times");
	}
	
}

class EnhancedStringDriver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		EnhancedString obj = new EnhancedString("Hello world");
		obj.reverse();
		obj.reverseWords();
		
		System.out.println("Enter a character : ");
		char c= sc.next().charAt(0);
		obj.countChar(c);
		
	}
}
