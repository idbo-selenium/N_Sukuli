package FlipCart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FlipCartShooping_Sikuli {

	public WebDriver driver;
	@Before
	public void Init(){
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
	}
	@After
	public void Cleanup(){
		driver.close();
	}
	@Test
	public void Sikuli_FlipCart()throws Exception{
		driver.get("http://www.flipkart.com/");
		Pattern search_bar = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Flipcart\\search_bar.png");//C:\Users\sravan\Desktop\\important\\Sikuli_Snippets\Flipcart
		Pattern searchButton_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Flipcart\\search_button.png");
		Pattern apple_case = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Flipcart\\apple_case.png");
		Screen src = new Screen();
		src.setAutoWaitTimeout(30);
		//enter data into search bar
		src.type(search_bar, "coolpad note 3");
		Thread.sleep(5000);
		//search button click
		src.click(searchButton_click);	
		Thread.sleep(2000);
		//select case
		src.click(apple_case);
		Thread.sleep(2000);
	}	
}