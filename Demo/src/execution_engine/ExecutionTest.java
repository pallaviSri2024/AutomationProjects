package execution_engine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import keywordDriven.Action_keyword;
import utility.ReadExcelSheet;

public class ExecutionTest {

	public static void main(String[] args) throws IOException, Exception,
	IllegalArgumentException, InvocationTargetException
	{
		ReadExcelSheet rs = new ReadExcelSheet();
		rs.DemoFile(4);
		Action_keyword k = new Action_keyword();
		k.openBrowser();
		k.navigate();
		k.enterEmail();
		k.enterPassword();
		k.Login();
		
		k.closeBrowser();
		System.out.println("Test executed successfully");
	}

}


