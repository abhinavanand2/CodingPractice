package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		String ExpTitle = "Google";
		System.setProperty("webdriver.chrome.driver", "C://Tech//LibrariesAndSoftwares//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		
		if(title.equals(ExpTitle)) {
			
			System.out.println("Title is correct");
		}
			else {
				
				System.out.println("Title is not correct");
			}
		
		driver.close();
			
		}
	}


