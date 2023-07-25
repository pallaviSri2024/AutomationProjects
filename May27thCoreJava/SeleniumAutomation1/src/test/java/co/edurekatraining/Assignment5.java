package co.edurekatraining;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assignment5 {
	
	String hubUrl ="http://192.168.1.41:4444";
	String url ="https://rediffmail.com";
	WebDriver driver ;
	public void setupGrid()
	{
	DesiredCapabilities ds= new DesiredCapabilities();
	ds.setCapability("browserName", "chrome");
	
	//ds.getBrowserVersion();
	//ds.setCapability("browserName", "firefox");
	try {
	driver = new RemoteWebDriver( new URL(hubUrl),ds);
	
	} catch (MalformedURLException e) {
	e.printStackTrace();
	}
	driver.get(url);
	}
	public void pageTitleValidation() {
	String title = driver.getTitle();
	System.out.println("page title :" +title);
	}
	public static void main(String[] args)
	{
		Assignment5 obj = new Assignment5();
		obj.setupGrid();
		obj.pageTitleValidation();
	}
}



