package Simplilearn;
import java.io.IOException;
import java.util.Scanner;
public class finalProject {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("LockedMe");
		System.out.println("Developed by Aashish Sangwan");
		
		FileNames fn = new FileNames();
		Operations op = new Operations();
		greetings gt = new greetings();
		File_Options fo = new File_Options();
		
		while(true) {
			Scanner S = new Scanner(System.in);
			gt.display();
			String userChoice = S.nextLine();
			switch(userChoice){
			case "1":

					fn.display();
					break;
					
			case "2":
				
					op.display();
					fo.display();
					break;
					
			case "3":
				
					System.out.println("Ending the program");
					System.exit(0);
					
			default:
				
					System.out.println("Invalid input");
					break;
					
			}
			
		}
		
	}

}


