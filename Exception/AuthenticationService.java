class AuthenticationService{
	String correctUsername;
	String correctPassword;
	
	void setCredentials(String correctUsername,String correctPassword){
		this.correctUsername=correctUsername;
		this.correctPassword=correctPassword;
	}
	
	public void authenticate(String username, String password){
		try{
			if(!username.equals(correctUsername) || !password.equals(correctPassword)){
				throw new AuthenticationException("Invalid username or password");
			}else{
				System.out.println("Authentication Successful");
			}
		}catch(AuthenticationException e){
			System.out.println("Authentication Failed : "+e.getMessage());
		}
		
	}
}
