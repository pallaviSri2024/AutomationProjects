package execution_engine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import keywords.Keyword;
import utility.Constants;
import utility.ReadExcelSheet;

public class ExecutionTest {

	public static void main(String[] args) throws IOException, Exception,
	IllegalArgumentException, InvocationTargetException
	{
		ReadExcelSheet rs = new ReadExcelSheet();
		rs.DemoFile(4);
		
		System.out.println("Test executed successfully");
	}

}


