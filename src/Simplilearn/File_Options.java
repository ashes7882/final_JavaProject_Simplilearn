package Simplilearn;

import java.util.Scanner;
import java.io.IOException;

public class File_Options  {
	
	public void display() throws IOException {
		File_Handling fh = new File_Handling();
		int count = 0;
		Operations op = new Operations();
		while(true) {
			Scanner S = new Scanner(System.in);
			String userChoice = S.nextLine();
			switch(userChoice){
			
			case "1":

				fh.createFile();   				// Put class that adds a file to the directory
				op.display();
				break;
					
			case "2":
				fh.DeleteFile();
				op.display();					// Put class that deletes a file in the directory
				break;	
					
			case "3":
				
				fh.searchFile();	
				op.display();					// Put class that searches for a file in the directory
				break;
				
			case "4":
				count = 1;
				break;
				
			default:
				System.out.println("Invalid input");
				op.display();
				break;
			}
			if(count == 1) {
				break;
			}
		}
		
		
	}
	

}
