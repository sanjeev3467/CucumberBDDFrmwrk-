package practice1;

public class Q3_ReverseInteger {

	public static void main(String[] args) {

      int num=12345;
      
      int rev=0;
      
      while(num!=0) {
    	  
    	  rev=rev*10+num%10; //5
    	  num=num/10;//1234
     	  
      }
      
      System.out.println(rev);
	
	//example 2
      
      //Here string buffer is mutable 
	
	int s1=9876;
	System.out.println(new StringBuffer(String.valueOf(s1)).reverse());
	
	
	}
}
