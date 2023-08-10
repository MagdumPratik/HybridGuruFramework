package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFiles {
	
	Properties pro;

	public ReadPropertyFiles() {
		File src = new File(".\\Configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is :" + e.getMessage());
		}
	}
	
	public String getUrl()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUser()
	{
		String user=pro.getProperty("username");
		return user;
	}
	
	public String getPass()
	{
		String pass=pro.getProperty("Password");
		return pass;
	}
}
