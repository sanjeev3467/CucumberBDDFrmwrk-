package practice1;

public class FindDuplicateCharsinString {

	public static void main(String[] args) {    
        String string1 = "sanjeevaiah Sompalli";    
        int count;    
            
        //Converts given string into character array    
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            
         //   System.out.println("I value is : "+i);
            for(int j = i+1; j <string.length; j++) {    
            	
         //   	System.out.println("J value is : "+j);	
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    
                    
                    //Set string[j] to 0 to avoid printing visited character    
                   string[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && string[i] != '0')  { 
            	//System.out.println(count);
                System.out.println(string[i]+" duplicate count is::: "+count);    
            } /*  if(string[i]=='a') {
            	
            	System.out.println(string[i]+" duplicate count is::: "+count); 
            	
            } */
        }    
    }    
}     
	

