package com.deluxe.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropHandlerz {
	public static String Filepath=System.getProperty("user.dir")+"\\OR.properties";
	public static Properties OR;
	public static InputStream IO;
	
	public static String fetchProp(String key) throws IOException{
		OR = new Properties();
		
			IO = new FileInputStream(Filepath);
			OR.load(IO);
		
			// supply key to return value for respective key..
		String value= OR.getProperty(key);
		return value;
		
	}

}
