package Trello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TrelloLogin_Sikuli {

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
	public void Trello_Login()throws Exception{
		driver.get("https://trello.com/login");
		Pattern username = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\username.png");//C:\Users\sravan\Desktop\important\Sikuli_Snippets\Trello
		Pattern password = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\password.png");
		Pattern login_button = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\loginButton.png");
		Pattern createboard_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\create_boardClick.png");
		Pattern board_title = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\board_name.png");
		Pattern createButton_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\create_buttonClick.png");
		Pattern list_title = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\list_name.png");
		Pattern list_save = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\list_save.png");
		Pattern addCard_Click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\addCard_Click.png");
		Pattern card_title = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\card_title.png");
		Pattern addcardclick = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\addcardclick.png");
		Pattern change_background_color = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\change_background_color.png");
		Pattern green_color = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\green_color.png");
		Pattern purple_color = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\purple_color.png");
		Pattern skyBlue_color = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\skyBlue_color.png");
		Pattern back_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\back_click.png");
		Pattern more_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\more_click.png");
		Pattern close_board_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\close_board_click.png");
		Pattern confirm_close = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\cofirm_close.png");
		Pattern profile_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\profile_click.png");
		Pattern logout_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\logout_click.png");
		Screen src = new Screen();
		src.setAutoWaitTimeout(30);
		//enter username
		src.type(username, "knskumari");
		Thread.sleep(2000);
		//enter password
		src.type(password, "pass@word1");
		//click login button
		src.click(login_button);
		Thread.sleep(2000);
		//board click
		src.click(createboard_click);
		Thread.sleep(2000);
		//enter board title
		src.type(board_title, "java");
		Thread.sleep(2000);
		//create button click
		src.click(createButton_click);
		Thread.sleep(2000);
		//enter list title
		src.type(list_title, "java1");
		Thread.sleep(2000);
		//save list click
		src.click(list_save);
		Thread.sleep(2000);
		//enter card title
		src.click(addCard_Click);
		Thread.sleep(2000);
		//card title
		src.type(card_title, "java11");
		Thread.sleep(2000);
		//Add card click
		src.click(addcardclick);
		Thread.sleep(2000);
		//background color click
		src.click(change_background_color);
		Thread.sleep(2000);
		//select green color
		src.click(green_color);
		Thread.sleep(2000);
		//select purple color
		src.click(purple_color);
		Thread.sleep(2000);
		//select blue color
		src.click(skyBlue_color);
		Thread.sleep(2000);
		//back click
		src.click(back_click);
		Thread.sleep(2000);
		//'more' click
		src.click(more_click);
		Thread.sleep(2000);
		//close board click
		src.click(close_board_click);
		Thread.sleep(2000);
		//confirm close
		src.click(confirm_close);
		Thread.sleep(2000);
		//profile click
		src.click(profile_click);
		Thread.sleep(2000);
		//logout click
		src.click(logout_click);	
		Thread.sleep(2000);		
		driver.close();
	}	
}