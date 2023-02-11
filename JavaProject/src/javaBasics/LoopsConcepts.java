package javaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		//1. While Loop
		
		int i=1;
		
		while(i<=10) {
			
			System.out.println("i value is : "+i);
				
			i=i+1;
		}
		
		
		//j++ means j=j+1
				
		//2. For Loop
		
		//print 1 to 10
		
		for(int j=1; j<=10; j++) //initialization, condtional, incremental
		{
			
			System.out.println(j);
			
		}
		
		//print 10 to 1
		
		for(int k=10;k>=1;k--) //initialization, condtional, decremental
		{
			
			System.out.println(k);
		}

	}

}
