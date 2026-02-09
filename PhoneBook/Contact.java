class Contact{
	EnhancedString name;
	String number;
	
	Contact(String name, String number){
		this.name = new EnhancedString(name);
		this.name.titleCase();
		this.number = number;
	}
	
	public static String nameLinearSearch(Contact[] contacts, String prefix){
		String result="";
		for(int i=0;i<contacts.length;i++){
			if(contacts[i].name.str.startsWith(prefix))
				result+=contacts[i].name.str+" ";
		}
		return result;
	}
	
	public static void sortContacts(Contact[] contacts){
		
		for(int i=0;i<contacts.length-1;i++){
			for(int j=i+1;j<contacts.length;j++){
				if(contacts[i].name.str.compareToIgnoreCase(contacts[j].name.str) > 0){
					Contact temp = contacts[i];
					contacts[i]=contacts[j];
					contacts[j]=temp;
				}
			}
		}
	}
	
	
	
}
