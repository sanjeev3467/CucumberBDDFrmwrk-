package practice1;

public class Q4_FindMissingNumberinArray {

	public static void main(String[] args) {

		int a[]= {1,2,4,5};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		
		System.out.println(sum);
        
		int b[]= {1,2,3,4,5};
		
		int sum1=0;
		
		for(int j=0;j<b.length;j++) {
			
			sum1=sum1+b[j];
		}
		
		System.out.println(sum1);

		System.out.println("Missing Number is :::"+(sum1-sum));
		
	}

}
