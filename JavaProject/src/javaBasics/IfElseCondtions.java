package javaBasics;

public class IfElseCondtions {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(b>a) {
			
			System.out.println("b is greaterthan a");
			
		} else{
			
			System.out.println("a is greaterthan b");
		}
		
		//comparision operators
		//<> <= >= ==   !=
		
		int c=30;
		int d=30;
		
		if(c==d) {
			
			System.out.println("c and d are equal");
		} else {
			
			System.out.println("c and d are not equal");
		}

		//write a logic to findout the highest number
		
		int a1=1100;
		int a2=1500;
		int a3=3100;
		
		//nested if condition
		
		if(a1>a2 & a1>a3) {
			
			System.out.println("a1 is highest value");
			
		} else if(a2>a3) {
			
			System.out.println("a2 is the highest value");
			
		} else {
			
			System.out.println("a3 is the highest value");
		}
	}

}
