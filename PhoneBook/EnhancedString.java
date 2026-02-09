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
        String rev,result="";
        String[] words= str.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            rev="";
            for(int j=word.length()-1;j>-1;j--){
                rev+=word.charAt(j);
            }
            result+=rev+" ";
        }
        System.out.println(result);

    }

    void titleCase(){
        String[] words = str.split(" ");
        String result="";
        for (int i=0;i<words.length;i++){
            String word = words[i];
            String newWord = Character.toUpperCase(word.charAt(0))+word.substring(1);
            result+=newWord+" ";
        }
        System.out.println(result);
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