package practice1;

import java.util.HashSet;
import java.util.Set;
public class DuplicateCharsInString {
	
	
public static void duplicate(String input){
        
        char chip[]=input.toCharArray();
                
        Set duplicateset=new HashSet<>();
         Set distinctset=new HashSet<>();
        
        for(char ch:chip){
            
        if (distinctset.add(ch)==false){
            
            duplicateset.add(ch);
            
        }
        
    }
    
       duplicateset.forEach(ch->System.out.println(ch));
        
         
    }
    
    public static void main(String[] args) {
        
        String input="sanjeev sompalli";
        DuplicateCharsInString.duplicate(input);
    }

}
