package Trello;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Trello_Sikuli {

	@Test
	public void Trello_Login()throws Exception{
		//WebDriver driver = new
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/login");
		Pattern username = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Trello\\username.png");
		Pattern password = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Trello\\password.png");
		Pattern logIn = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Trello\\logIn.png");
		Pattern profile = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Trello\\profile.png");
		Pattern logOut = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Trello\\logOut.png");
		Screen src = new Screen();
		src.type(username, "knskumari");
		src.type(password, "pass@word1");
		src.click(logIn);Thread.sleep(4000);
		src.click(profile);
		src.click(logOut);	
		driver.close();
	}
}