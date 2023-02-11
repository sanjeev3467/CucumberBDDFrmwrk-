package practice1;

public class Q1_ReverseAString {
	
	public static void main(String []args) {

	//Q. Reverse a String
   // example 1 using loop
	
	String s="sanjeevaiah";
	//Here String is immutable we cannot user reverse() function or method with this object, with this object reverse method not ther
	
	int len=s.length();//length of the string
	
	String rev="";
	
	for(int i=len-1;i>=0;i--) {
	
	rev=rev+s.charAt(i);
		
	}
	
	System.out.println(rev); 
	
	//example 2 
	//String Buffer is mutable and had reverse function
	
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.reverse());
	
	} 
		
}
