package TechnicalTest;

import java.io.*;  


//this is the class i have managed to split into 2 separate files
//if i was to split a file into two more files i would do something similar to this


	public class SplitTheFile {  
		
		public static void main(String args[]) {  
 
			try{  
  // Reading file and getting no. of files to be generated  
  String inputfile = "C:\\import_data.csv"; //  Source File Name.  
  double nol = 5000.0; //  No. of lines to be split and saved in each output file.  

  int count = 2;  
  
  System.out.println("file to be split" + count + "times" + ".");     // Displays no. of lines in the input file.  

  double temp = (count);  
  int temp1=(int)temp;  
  int noOfFiles = 0;  
  if(temp1==temp)  
  {  
	  noOfFiles=temp1;  
  }  
  else  
  {  
	  noOfFiles=temp1;  
  }  
  System.out.println("a succeeded validation and a failed validation file to be generated :" +noOfFiles); // Displays no. of files to be generated.  


  // Actual splitting of file into smaller files  

  FileInputStream fstream = new FileInputStream(inputfile);
  DataInputStream in = new DataInputStream(fstream);  

  BufferedReader br = new BufferedReader(new InputStreamReader(in)); 
  String strLine;  

  for (int j=1; j<=noOfFiles; j++)  
  {  
   FileWriter fstream1 = new FileWriter("C:\\File"+j+".txt");     // Destination File Location  
   BufferedWriter out = new BufferedWriter(fstream1);   
   for (int i=1;i<=nol;i++)  
   {  
    strLine = br.readLine();   
    if (strLine!= null)
    {  
     out.write(strLine);   
     if(i!=nol)  
     {  
      out.newLine();  
     }  
    }  
   }  
   out.close();  
  }  

  in.close();  
 }catch (Exception e)  
 {  
  System.err.println("Error: " + e.getMessage());  
 }  

}  

}   

