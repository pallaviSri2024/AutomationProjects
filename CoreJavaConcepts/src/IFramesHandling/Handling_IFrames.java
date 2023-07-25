package IFramesHandling;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Handling_IFrames {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\FirstTestngProject\\Driver\\chromedriver.exe");
		
		//Create a new instance of ChromeDriver and redirect to the Base URL
			
		driver=(WebDriver) new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);
		//Search for IFrames
		List web_iframe = driver.findElements(By.tagName("iframe"));
		int iFrameCount = web_iframe.size();
		//Print the total number of IFrames on a given web page
		System.out.println("No. of IFrames: " + iFrameCount);
		driver.quit();

		
	}

}
