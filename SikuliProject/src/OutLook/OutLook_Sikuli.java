package OutLook;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class OutLook_Sikuli {

	@Test
	public void OutLook_Login()throws Exception{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://email.i-dbo.com/owa/#path=/mail");
		Pattern username = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\username.png");
		Pattern password = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\password.png");
		Pattern signIn = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\signIn.png");
		Pattern newMail = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\newMail.png");
		Pattern toAddress = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\toAddress.png");
		Pattern subject = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\subject.png");
		//Pattern send = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\send.png");
		//Pattern profile = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\proflie.png");
		//Pattern signOut = new Pattern("F:\\Eclipse_Selenium\\Java_Selenium_Maven\\SikuliProject\\OutLook\\signOut.png");
		Screen src = new Screen();
		src.type(username, "nkorada");
		src.type(password, "pass@word2");
		src.click(signIn);Thread.sleep(20000);
		src.click(newMail);
		Thread.sleep(20000);
		src.type(toAddress, "Nirmala@ProConstructor.com");//Nirmala@ProConstructor.com
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		src.type(subject, "Subject");
		//src.click(send);
		//src.click(profile);
		//src.click(signOut);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[1]/div[6]/div/div/div[2]/div[1]/span[1]/div[1]/button[1]")).click();
		//Profile click
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/table/tbody/tr/td[1]/button/div[2]/span")).click();
		//SignOut click
		//driver.findElement(By.xpath("//*[@id='_ariaId_598']/div/div[2]/div[3]/div/div[4]/div/div/span[2]")).click();
	}
}