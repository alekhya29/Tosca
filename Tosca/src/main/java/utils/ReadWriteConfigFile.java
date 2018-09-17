package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadWriteConfigFile {

	
	
	public  String getpropertfromconfig(String key)
	{
		String value="";
		
		try
		{
			Properties 	prop = new Properties();
			FileInputStream Filenew = new FileInputStream("src\\test\\resources\\config_prop\\config.properties");	
			prop.load(Filenew);
			value=prop.getProperty(key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return value;
		
		
		
		
	}

}
