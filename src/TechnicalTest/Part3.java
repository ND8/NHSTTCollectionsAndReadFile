package TechnicalTest;


/*this part copies the import file into a Succeeded Validation file.
 * i was not quite able to get the original file to split the success and failed post codes
 * i was however able to split the import file into 2 separate files in a separate class called "SpliTheFile"which
 * i have also attached.
 */

import java.io.*;

public class Part3 {

		   public static void main(String[] args)  throws Exception {
		     
			  BufferedWriter out1 = new BufferedWriter(new FileWriter("C:\\import_data.csv"));
		      out1.write("string to be copied\n");
		      out1.close();
		     
		      InputStream in = new FileInputStream(new File("C:\\import_data.csv"));
		      OutputStream out = new FileOutputStream(new File("C:\\Succeeded_validation.csv"));
		      
		      byte[] buf = new byte[1024];
		     
		      int len;
		     
		      while ((len = in.read(buf)) > 0) {
		         out.write(buf, 0, len);
		      }
		      
		      in.close();
		      out.close();
		      
		      BufferedReader in1 = new BufferedReader(new FileReader("destinationfile"));
		      String str;
		      
		      while ((str = in1.readLine()) != null) {
		         System.out.println(str);
		      }
		      in.close();
		   }
		}