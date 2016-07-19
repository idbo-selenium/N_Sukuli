package Gmail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class gmailLogin_Sikuli {
 
	@Test
	public void SikuliTest()throws Exception{
	//public static void main(String[] args)throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&osid=1&service=mail&ltmpl=default&rm=false#identifier");
		//sending email
		driver.findElement(By.id("Email")).sendKeys("srinivas.v145@gmail.com");//https://www.youtube.com/watch?v=06tUEDJTVx8
		//next button click
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		//password sending
		driver.findElement(By.id("Passwd")).sendKeys("krishvani");
		//signin button click
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		//compose button click
		driver.findElement(By.xpath("//*[@id=':j2']/div/div")).click();
		Thread.sleep(3000);
		//sending To address
		driver.findElement(By.id(":oe")).sendKeys("knskumari@gmail.com");
		//subject sending
		driver.findElement(By.xpath("//*[@id=':ny']")).sendKeys("Sikuli");
		//Body
		driver.findElement(By.xpath("//*[@id=':p3'")).sendKeys("werrr[retyuiopkl");
		//attach file click
		driver.findElement(By.xpath("//*[@id=':pt']")).click();
		
		Pattern filename = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\filename.png");
		Pattern openButton = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\openbutton.png");
		Pattern sentmail = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\sentmail.png");
		Pattern sentmail_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\sentmail_click.png");
		
		Screen src = new Screen();
		src.setAutoWaitTimeout(30);
		src.type(filename, "C:\\Users\\sravan\\Desktop\\pics\\2.jpg");
		Thread.sleep(4000);
		src.click(openButton);
		
		//send button click
		driver.findElement(By.xpath("/html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
		Thread.sleep(4000);
		
		//sent items button click
		src.click(sentmail);
		Thread.sleep(4000);
		
		//sent mail click
		src.click(sentmail_click);
		Thread.sleep(2000);
		
		//profile click
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(2000);
		
		//signout click
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/a")).click();
		Thread.sleep(3000);
		driver.close();
	}	
}