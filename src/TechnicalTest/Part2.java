package TechnicalTest;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

public class Part2 {

	@SuppressWarnings("deprecation")
	public static void main (String[] args){
		
		 
		/* This class reads the text file line by line and print to the console. It uses
		 * FileOutputStream to read the file.
		 */	
			FileInputStream fis = null;
		    BufferedInputStream bis = null;
		    DataInputStream dis = null;
		    
		    File f = new File("C:\\import_data.csv");
		    
		 
		    try { 
		      fis = new FileInputStream(f);
		 
		      // Here BufferedInputStream is added for fast reading.
		      bis = new BufferedInputStream(fis);
		      dis = new DataInputStream(bis);
		 
		      System.out.println("row ID:" + "\t" + "postcode: ");
		      
		      // dis.available() returns 0 if the file does not have more lines.
		      while (dis.available() != 0) {
		    	  
		    	//  Part1Test p1 = new Part1Test();
		    	  //p1.equals((ArrayList[]) ((List) f).toArray(new ArrayList[((List) f).size()]));
		    	  
		 
		      // this statement reads the line from the file and also prints it to the console
		     
		    	  System.out.println(dis.readLine());
		      }
		  	
		      // disposing of all the resources after using them.
		      fis.close();
		      bis.close();
		      dis.close();
		 
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	
		   
	
	}
	
}
		