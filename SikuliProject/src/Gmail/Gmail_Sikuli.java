package Gmail;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Gmail_Sikuli {

	@Test
	public void GmailLoign_Sikuli()throws Exception{
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Pattern username = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\username.png");
		Pattern nextButton = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\nextButton.png");
		Pattern password = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\password.png");
		Pattern signIn = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\signIn.png");		
		Pattern composeButton = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\composeButton.png");
		Pattern toAddress = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\toAddress.png");
		Pattern subject = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\subject.png");
		Pattern body = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\body.png");
		Pattern attachFile = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\attachFile.png");
		Pattern filename = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\filename.png");
		Pattern openButton = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\openButton.png");
		Pattern sendButton = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\sendButton.png");
		Pattern profile = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\profile.png");
		Pattern signOut = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\signOut.png");
		
		Screen scr = new Screen();
		scr.type(username, "srinivas.v145@gmail.com");
		scr.click(nextButton);
		scr.type(password, "krishvani");
		scr.click(signIn);
		Thread.sleep(4000);
		scr.click(composeButton);
		scr.type(toAddress, "knskumari");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
		
		scr.type(subject, "Test Mail");
		scr.type(body, "Sample Mail");
		
		scr.click(attachFile);
		scr.type(filename, "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\Gmail\\attachFile.png");
		scr.click(openButton);Thread.sleep(4000);
		scr.click(sendButton);
		scr.click(profile);
		scr.click(signOut);
		driver.close();
	}	
}