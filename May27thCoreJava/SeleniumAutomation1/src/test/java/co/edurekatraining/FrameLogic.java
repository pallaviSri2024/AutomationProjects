package co.edurekatraining;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLogic {

	public static void main(String[] args) throws Exception {
		

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\FirstTestngProject\\Driver\\chromedriver.exe");
		
		//Create a new instance of ChromeDriver and redirect to the Base URL
			
		driver=(WebDriver) new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		List<WebElement> childsFrames = driver.findElements(By.tagName("frame"));
		System.out.println("Total number of frames  " + childsFrames.size());
		
		driver.switchTo().frame("packageListFrame");
		//driver.switchTo().frame("/html/frameset/frame");
		List<WebElement> childs = driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links under package frame " + childs.size());
	    for(int i=0; i< childs.size(); i++)

	    {

	    System.out.println(childs.get(i).getText());

	    }
		
	    driver.quit();
	}
}


