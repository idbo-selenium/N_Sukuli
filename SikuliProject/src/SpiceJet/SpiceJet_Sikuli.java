package SpiceJet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SpiceJet_Sikuli {

	public WebDriver driver;
	@Before
	public void Init(){
		driver = new FirefoxDriver();	driver.get("http://spicejet.com/");	
	}
	
	@After
	public void Cleanup(){
		//driver.close();
	}
	
	@Test
	public void SikuliTest()throws Exception{	
		
		Pattern findFlight_Button = new Pattern("C:\\Users\\sravan\\Desktop\\SpiceJet\\FindFlightsButton.png");		
		Pattern OKButtonClick = new Pattern("C:\\Users\\sravan\\Desktop\\SpiceJet\\OKButtonClick_SpiceJet.png");
		Pattern oneway_ButtonClick = new Pattern("C:\\Users\\sravan\\Desktop\\SpiceJet\\OneWay_RadioButton.png");
		Pattern selectLeavingFrom = new Pattern("C:\\Users\\sravan\\Desktop\\SpiceJet\\Select_LeavingFrom.png");
		Pattern leavingFrom = new Pattern("C:\\Users\\sravan\\Desktop\\SpiceJet\\LeavingFrom.png");
		Pattern goingTo = new Pattern("C:\\Users\\sravan\\Desktop\\SpiceJet\\GoingTo.png");
		Pattern travelDate = new Pattern("C:\\Users\\sravan\\Desktop\\SpiceJet\\TravelDate.png");
		
		Screen src = new Screen();
		src.setAutoWaitTimeout(30);Thread.sleep(4000);
		src.click(findFlight_Button);
		src.click(OKButtonClick);
		src.click(oneway_ButtonClick);
		src.click(selectLeavingFrom);
		src.click(leavingFrom);
		Thread.sleep(3000);
		src.click(goingTo);
		src.click(travelDate);
		src.click(findFlight_Button);
	}	
}