package com.expenseondemand.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * 
 * 
 * @author NehaJha
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
		FileInputStream fis = new FileInputStream(IConstant.propertiesPath);

		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(Key);
		return value;

	}

}
