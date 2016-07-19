package GitHub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_GitHubLogin {

	public WebDriver driver;
	@Before
	public void Init(){
		driver = new FirefoxDriver();
		driver.get("https://github.com/login");
	}
	@After
	public void Cleanup(){
		driver.close();
	}
	
	@Test
	public void GitHub_Login() throws Exception{
		Pattern username = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\GitHub\\username_textbox.png");
		Pattern password = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\GitHub\\password_textbox.png");
		Pattern signin = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\GitHub\\signin_button.png");
		Pattern profile_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\GitHub\\profile.png");
		Pattern signout_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\GitHub\\signout.png");
		
		Screen src = new Screen();
		src.setAutoWaitTimeout(30);
		src.type(username, "nirmalakumari");
		Thread.sleep(2000);
		src.type(password, "pass@word1");
		Thread.sleep(2000);
		src.click(signin);
		Thread.sleep(4000);
		src.click(profile_click);
		Thread.sleep(2000);
		src.click(signout_click);
	}
}