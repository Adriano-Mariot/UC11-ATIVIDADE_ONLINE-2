package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteDeNavegabilidade {

	ChromeDriver driver;
	
	// before-test

	@Before 
	public void PreTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedrive\\chromedriver.exe");
		//open browser
		this.driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.get("http://localhost:4200");
	}
	
	// real time test
	@Test
	public void TesteIni() { 
		driver.get("http://localhost:4200//login");
		driver.findElementById("email").sendKeys("Usuario");
		driver.findElementById("signin").click();
	}
	
	//after test
	@After
	public void PosTeste() {
//		driver.quit();

	}
	
}
