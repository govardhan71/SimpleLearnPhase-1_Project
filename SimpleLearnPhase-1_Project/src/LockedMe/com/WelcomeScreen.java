package LockedMe.com;

public class WelcomeScreen {
	
	void welcome() {

		System.out.println("--------WELCOME TO APPLICATION--------");
		System.out.println("--------------LOCKEDME-----------");
		System.out.println("Developer Details");
		System.out.println("Name:Ravula Govardhan Reddy"+"\n"+"Contact:govardhan71@gmail.com");
		
	}
	
	public void mainOptions(){
		System.out.println("Select Option below"+"\n"+
	                           "1 for List of files in Directory \n"+
				                "2 for Create,Delete,Search the file in Directory \n"+
	                            "3 for Exit Application");
		
	}
	
	void fileOptions() {
		System.out.println("Select option below to add or delete or search of files \n"+
	                            "a for Add file \n"+
				                "d for Delete file \n"+
	                            "s for Search file \n"+
				                "m for Back to Main menu");
	}
	
	
		

}
