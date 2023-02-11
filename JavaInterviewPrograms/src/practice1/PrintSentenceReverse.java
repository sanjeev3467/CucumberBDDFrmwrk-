package practice1;

import java.util.Scanner;

public class PrintSentenceReverse {
	
			
		    public static String reversestringsentence(String  InputString) {
		        
		        		              
		        String word[]=InputString.split("\\s");
		        
		        String Outputvalue="";
		        
		        for(int i=word.length-1;i>=0;i--){
		            
		            Outputvalue=Outputvalue+word[i]+" ";
		            
		        }
		        
		              
		        return Outputvalue;
		    }
		
		    public static void main(String[] args) {
		    	
		    	Scanner sc=new Scanner(System.in);
		    	
		    	String InputString=sc.nextLine();
		    	
		    	System.out.println("Input String is ::: "+InputString);
		    	
		    	String Outputvalue=PrintSentenceReverse.reversestringsentence(InputString);
		    	
		    	System.out.println("Output Sting is ::: "+Outputvalue);
		    	
		           }
		    
	}


