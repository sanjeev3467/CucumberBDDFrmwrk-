package restAssuredTests;

import org.apache.commons.lang3.*;

public class RestUtils {
	
	public static String getFirstName() {
	
		String generatedstring=RandomStringUtils.randomAlphabetic(1);
		
		return ("John"+generatedstring);
		
	}
	
	public static String getLastName() {
		
		String generatedstring=RandomStringUtils.randomAlphabetic(1);
		
		return ("Johns"+generatedstring);
		
	}
	
public static String getUserName() {
		
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		
		return ("John"+generatedstring);
		
	}
public static String getPassword() {
	
	String generatedstring=RandomStringUtils.randomAlphabetic(3);
	
	return ("John"+generatedstring);
	
}

public static String getEmail() {
	
	String generatedstring=RandomStringUtils.randomAlphabetic(3);
	
	return (generatedstring+"@gmail.com");
	
}

public static String getempName() {
	
	String generatedstring=RandomStringUtils.randomAlphabetic(3);
	
	return ("john"+generatedstring);
	
}

public static String getempDesig() {
	
	String generatedstring=RandomStringUtils.randomAlphabetic(3);
	
	return ("Devloper"+generatedstring);
	
}

public static String getempSal() {
	
	String generatedstring=RandomStringUtils.randomNumeric(5);
	
	return (generatedstring);
	
}

public static String getempAge() {
	
	String generatedstring=RandomStringUtils.randomNumeric(2);
	
	return (generatedstring);
	
}

}