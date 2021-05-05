import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http:/facebook.com");
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
