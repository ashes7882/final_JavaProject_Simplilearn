package Simplilearn;

import java.io.File;

public class FileNames {

	public void display() {
        // Creates an array in which we will store the names of files and directories
        String[] filenames;
        
        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("D:\\Final Java Project\\src");

        // Populates the array with names of files and directories
        filenames = f.list();

        // For each pathname in the pathnames array
        for (String x : filenames) {
            // Print the names of files and directories
            System.out.println(x);
        }
    }
}
