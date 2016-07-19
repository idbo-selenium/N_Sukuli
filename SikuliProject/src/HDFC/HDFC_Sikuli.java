package HDFC;

import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class HDFC_Sikuli {

	public WebDriver driver;
	@Before
	public void Init(){
		driver = new FirefoxDriver();
	}
	
	@After
	public void CleanUp(){
		//driver.close();
	}
	
	@Test
	public void Sikuli_HDFCLogin() throws Exception{
		driver.get("http://www.hdfcbank.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println("first Window : " +parentWindow);
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(4000);
		Set<String> childWindow = driver.getWindowHandles();
		for(String handles : childWindow){
			System.out.println("handles : "+handles);
			if(!handles.equals(parentWindow)){
				Pattern continueButton_Click = new Pattern("C:\\Users\\sravan\\Desktop\\HDFC\\HDFC_ContinueButton.png");
				Pattern continueButton_Click_HDFCLogin = new Pattern("C:\\Users\\sravan\\Desktop\\HDFC\\continueButton_Click_HDFCLoginPage.png");
				Pattern OKButton_Click_HDFCLogin = new Pattern("C:\\Users\\sravan\\Desktop\\HDFC\\OKButtonClick_HDFCLoginPage.png");
				
				Screen src = new Screen();
				src.setAutoWaitTimeout(30);
				src.click(continueButton_Click);
				Thread.sleep(3000);
				
				src.click(continueButton_Click_HDFCLogin);
				src.setAutoWaitTimeout(30);
				src.click(OKButton_Click_HDFCLogin);
			}
		}
	}
}