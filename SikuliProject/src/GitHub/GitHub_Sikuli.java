package GitHub;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GitHub_Sikuli {

	@Test
	public void GitHub_Login()throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Pattern username = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\GitHub\\username.png");
		Pattern password = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\GitHub\\password.png");
		Pattern signIn = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\GitHub\\signIn.png");
		Pattern profile = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\GitHub\\profile.png");
		Pattern signOut = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\GitHub\\signOut.png");
		Screen src = new Screen();
		src.type(username, "nirmalakumari");
		src.type(password, "pass@word1");
		src.click(signIn);Thread.sleep(4000);
		src.click(profile);
		src.click(signOut);
		driver.close();
	}	
}