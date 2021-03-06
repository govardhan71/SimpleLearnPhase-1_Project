package LockedMe.com;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		WelcomeScreen Opt =new WelcomeScreen();
		Opt.welcome();
		Opt.mainOptions();
		
		FilesHandling fle = new FilesHandling();
		
		while (true) {
			try{
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
	            int option = scanner.nextInt();
	            switch (option){
	                case 1 :
	                    fle.listOfFiles();
	                    Opt.mainOptions();
	                    break;
	                case 2 :
	                    Opt.fileOptions();
	                    fle.fileOptionsHandling();
	                    break;
	                case 3 :
	                    System.out.println("Closing Application...."+"\n"+"Thank You");
	                    System.exit(0);
	                    break;
	                default:
	                	System.out.println("Please enter 1, 2 or 3");
	                    Opt.mainOptions();
	            }
	        }
	        catch (Exception e){
	            System.out.println("Error : Please enter 1, 2 or 3");
	            Opt.mainOptions();
	        }

		}
		
			
		}
		

}
