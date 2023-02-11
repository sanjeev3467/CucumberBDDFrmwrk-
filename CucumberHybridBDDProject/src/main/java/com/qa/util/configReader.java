package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	private Properties prop;
	
	public Properties init_property() {
		
		prop=new Properties();
		
		try {
			FileInputStream fs=new FileInputStream("./src/test/resources/config/Config.properties");
			prop.load(fs);
		
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}
	

}
