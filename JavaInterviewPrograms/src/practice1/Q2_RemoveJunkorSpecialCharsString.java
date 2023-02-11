package practice1;

public class Q2_RemoveJunkorSpecialCharsString {

	public static void main(String[] args) {
		
		String s="%$@%$&^% Testing 3726537265";
		
		String s1="sanjeev)((*&*(&*&(&* 097656467465";
		//Regular Expression : [^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(s1);

	}

}
