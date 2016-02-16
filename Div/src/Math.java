import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Math {
	String Line = "";
	 FileReader odczyt = null;
	 String File="dane.txt";
	
	public void  ReadingFromTxt() 
	{
		 try {
			odczyt = new FileReader(File);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
		 BufferedReader bfe = new BufferedReader(odczyt);
		
		 
		 try {
		     while((Line = bfe.readLine()) != null){
		         System.out.println(Line);
		        int ind = Line.indexOf("70");
		        if (ind >= 0) {
		           String yourValue = Line.substring(ind+"70".length(), Line.length()-1).trim();
		           System.out.println(yourValue);
		          
		        }
		     }
		 }
		     catch (IOException e) {
		        System.out.println("B£¥D ODCZYTU Z PLIKU!");
		        System.exit(2);
		   }
		
		 
		 
		
		
		
		
	}
		
		   
			
		
	

	
	     
	 public static void main(String[] args) {
		 
		Math rd= new Math();
		rd.ReadingFromTxt();
		
		
		
		 
	       
	      
	       
	    }

	

}
