
		package Chrome;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Locators {
			public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://paytm.com/");
			WebElement ele = driver.findElement(By.xpath("//section[3]//div[1]//div[1]//div[1]//div[1]//img[1]"));
			ele.click();
			WebElement ele1 = driver.findElement(By.xpath("//a[@href='/metro-card-recharge']//img[@alt='image']"));
			ele1.click();
			//driver.close();

		}

}


