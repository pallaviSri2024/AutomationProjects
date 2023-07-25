package Generic;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * 
 * 
 * @author Pallavi Srivastava
 *
 */

public class FileUtility {

	/**
	 * it is used to read the data from CommonData.properties File based on key
	 * which you pass as an argument
	 * 
	 * @param key
	 * @throws Throwable
	 * 
	 */
	public String getPropertyFromKeyValue(String Key) throws Throwable {
		FileInputStream fis = new FileInputStream(Constants.url);

		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(Key);
		return value;

	}

}
