package Simplilearn;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class File_Handling {
	
	public void createFile() throws IOException {
		
		System.out.println("Please provide the filename to add or enter q to cancel");
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();
		
		if(filename.equalsIgnoreCase("q")) {
			System.out.println("Addition cancelled");
		}else {
			File myObj = new File("D:\\Final Java Project\\src", filename);


			if (myObj.createNewFile()) {														// create the file
				System.out.println("Added the file: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		}
	}
	
	public void DeleteFile() throws IOException {
			System.out.println("Please provide the filename to delete or enter q to cancel");
			Scanner sc = new Scanner(System.in);
			String filename = sc.nextLine().toLowerCase();
			if(filename.equalsIgnoreCase("q")) {
				System.out.println("Deletion cancelled");
			}else {
				File myObj = new File("D:\\Final Java Project\\src", filename); 
			    if (myObj.delete()) { 															// delete the file
			      System.out.println("Deleted the file: " + myObj.getName());
			    } else {
			      System.out.println("Failed to delete the file.");
			    }
			}
		    
		}
	
	public void searchFile() {
		
		System.out.println("Please provide the filename to search or enter q to cancel");			// Search for file
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine().toLowerCase();	
        File dir = new File("D:\\Final Java Project\\src");
        String[] filenames = dir.list();
        int count = 0;
        if(filename.equals("q")) {
        	System.out.println("Search cancelled");
        }else {
        	  for (String x : filenames) {
                  
                  if(x.equalsIgnoreCase(filename)) {
                  	System.out.println("File is found");
                  	break;
                  }else {
                  	count++;
                  }
                  if(count == filenames.length) {
                  	System.out.println("File not found");
                  }
              }
        }
      
		
		
	}

}
