package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// + operator is used for concatenation
		//println() statement is used to print the console in new line
		//print statement is just used to print on the console
		
		//execution will be left to right
		int a=100;
		int b=200;
		
		double d1=10.12;
		double d2=11.13;
		
		String x="Hello";
		String y="World";
		
			
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println((a+b)+x+y);
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(d1+d2);
		System.out.println(x+y+d1+d2);
		
		System.out.println("String Concatenation");
		System.out.println(a);
		System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
		System.out.println("a and b sum is : "+(a+b));
		System.out.print("India");//print in same line, becoz not mention the ln in print statement
		System.out.println("United Kingdom");
	}

}
