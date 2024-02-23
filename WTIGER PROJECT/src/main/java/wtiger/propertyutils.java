package wtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * 
 * @author mahi
 * here we stored all resuable methods of file operations
 *
 */
public class propertyutils {
	/**
	 * fetching data from file
	 * @return 
	 * @throws Throwable 
	 */

	public String filedatafetch(String path,String key) throws Throwable
	
	{
	FileInputStream fis = new FileInputStream(path);
	Properties pobj = new Properties();
	pobj.load(fis);
	return pobj.getProperty(key);
		
	}
		

	

}
