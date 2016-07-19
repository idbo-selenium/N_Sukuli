package Mercury;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Mercury_Sikuli {

	@Test
	public void Mercury_Login()throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		Pattern signOn = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Mercury\\signOn.png");
		Pattern username = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Mercury\\username.png");
		Pattern password = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Mercury\\password.png");
		Pattern submit = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Mercury\\submit.png");
		Pattern signOff = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Mercury\\signOff.png");
		
		Screen src = new Screen();
		src.click(signOn);
		src.type(username, "mercury");
		src.type(password, "mercury");
		src.click(submit);Thread.sleep(2000);
		src.click(signOff);Thread.sleep(2000);
		driver.close();
	}
}