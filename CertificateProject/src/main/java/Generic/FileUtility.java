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

	public String getPropertyFromKeyValue(String Key) throws Throwable {
		FileInputStream fis = new FileInputStream(Constants1.url);

		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(Key);
		return value;

	}

}
