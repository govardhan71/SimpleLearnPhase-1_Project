package LockedMe.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesHandling {
	File Path = new File("E:\\SimpleLearnPhase-1_Project\\sample");
	void listOfFiles() {
		String contents[] = Path.list();
		if (contents.length==0)
			System.out.println("Folder is Empty No Files Exist");
		else {
			 System.out.println("List of files in the specified directory:");
		      for(int i=0; i<contents.length; i++) {
		         System.out.println(contents[i]);
		      }
		}
			
	     
	}
	
	void addFile(String filename) throws IOException {
        File filepath = new File(Path +"/"+filename);
        String[] list = Path.list();
        for (String file: list) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println("File " + filename + " is already exists at " + Path);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+" added to "+ Path);
    }
	
	void deleteFile(String filename) {
        File filepath = new File(Path +"/"+filename);
        String[] list = Path.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
                System.out.println("File " + filename + " deleted from " + Path);
                return;
            }
        }
        System.out.println("Delete Operation failed. FILE NOT FOUND");
    }
	
	void searchFile(String filename) {
        String[] list = Path.list();
        for (String file: list) {
            if (filename.equals(file)) {
                System.out.println("FOUND : File " + filename + " exists at " + Path);
                return;
            }
        }
        System.out.println("File NOT found (FNF)");
    }
	
	void fileOptionsHandling() {
		WelcomeScreen w = new WelcomeScreen();
		int gotoMainMenu = 0;
		while (gotoMainMenu==0) {
			try{
	            @SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
	            char input = scanner.next().charAt(0);
	            char option = Character.toLowerCase(input);

	            switch (option){
	                case 'a' : {
	                    System.out.print("Adding a file...Please Enter a File Name : ");
	                    String filename = scanner.next().trim().toLowerCase();
	                    addFile(filename);
	                    w.fileOptions();
	                    break;
	                }
	                case 'd' : {
	                    System.out.print("Deleting a file...Please Enter a File Name : ");
	                    String filename = scanner.next().trim();
	                    deleteFile(filename);
	                    w.fileOptions();
	                    break;
	                }
	                case 's' : {
	                    System.out.print("Searching a file...Please Enter a File Name : ");
	                    String filename = scanner.next().trim();
	                    searchFile(filename);
	                    w.fileOptions();
	                    break;
	                }
	                case 'm' : {
	                    System.out.println("Going Back to MAIN menu");
	                    w.mainOptions();
	                    gotoMainMenu = 1;
	                    break;
	                }
	                default : System.out.println("Please enter a, d, s or m");
	            }
	            
	        }
	        catch (Exception e){
	            System.out.println("Please enter a, d, s or m");
	            w.fileOptions();
	        }
		}
        
    }
	

}
