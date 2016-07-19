package Mercury;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Mercury_Login {

	public WebDriver driver;
	@Test
	public void Login()throws Exception{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		Pattern username = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Mercury\\username.png");
		Pattern password = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Mercury\\password.png");
		Pattern signin = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Mercury\\signIn_button.png");
		Pattern signOut = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Mercury\\signOut_button.png");
		Screen src = new Screen();
		src.setAutoWaitTimeout(20);
		src.type(username,"mercury");
		Thread.sleep(4000);
		
		src.type(password, "mercury");
		Thread.sleep(4000);
		
		src.click(signin);
		Thread.sleep(4000);
		
		src.click(signOut);
		Thread.sleep(4000);
		
		driver.close();	
	}	
}