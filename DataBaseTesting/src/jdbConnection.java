import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host= "localhost";
		String port= "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/testdbqa", "root","Abhi@9742abhi");
		Statement s = con.createStatement();
		ResultSet rs= s.executeQuery("select * from credentials where Name ='Ram'");
		
		while(rs.next())
		{
		
//			System.setProperty("webdriver.chrome.driver", "C://Tech//LibrariesAndSoftwares//chromedriver_win32//chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			
//			driver.get("https://login.salesforce.com ");
//			
//			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("Username"));
//			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("Password"));
		
		System.out.println(rs.getString("Username"));
		System.out.println(rs.getString("Password"));
	

	}

}
}
